package pt.isel.SHORT

import pt.isel.SHORT.html.Attribute
import pt.isel.SHORT.html.Html
import pt.isel.SHORT.html.HtmlPage
import pt.isel.SHORT.html.HtmlTag
import pt.isel.SHORT.html.element.Body
import pt.isel.SHORT.html.element.Div
import pt.isel.SHORT.html.element.Head
import pt.isel.SHORT.html.element.Script
import pt.isel.SHORT.html.id
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.reflect.Method
import kotlin.reflect.jvm.kotlinFunction

/**
 * This annotation is used to represent a page in the web application
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class Page(val path: String)

typealias PageFactory = Method

/**
 * Generates a [WebApp] from the functions annotated with [Page]
 * @return a [WebApp] with a single page that contains the whole single page application
 * @throws [ClassLoaderException] if it isn't able to load the system class loader
 * @throws
 */
fun generateWebApp(): WebApp {
    val sysClassLoader: ClassLoader
    try {
        sysClassLoader = ClassLoader.getSystemClassLoader()
    } catch (e: Exception) {
        when (e) {
            is SecurityException, is IllegalStateException ->
                throw ClassLoaderException("Couldn't get the system class loader", e)
            else -> throw e
        }
    }
    val classNames = sysClassLoader.searchClasses("")
    val webApp = aggregatePages(getPages(classNames))
    return webApp.toHtml()
}

/**
 * Searches for java classes in a package
 * @param [packageName] the package name where search for classes
 * @return the list of classes in the package
 */
fun ClassLoader.searchClasses(packageName: String): List<String> {
    if (packageName == "META-INF") return emptyList()

    val classpath = packageName.replace(".", "/")
    val resourceStream = getResourceAsStream(classpath) ?: return emptyList()
    val lines = BufferedReader(InputStreamReader(resourceStream)).readLines()

    return lines.flatMap { entry: String ->
        return@flatMap if (entry.endsWith(".class")) {
            listOf<String>("$packageName.${entry.replace(".class", "")}")
        } else {
            searchClasses(if (packageName.isEmpty()) entry else "$packageName.$entry")
        }
    }.toList()
}

/**
 * Converts the list of class names into a list will the corresponding pages
 * @param [classNames] the [List] of [String] containing the names of the classes
 * @return the list of [PageFactory]
 */
fun getPages(classNames: List<String>): List<PageFactory> {
    return classNames.flatMap { className ->
        return@flatMap try {
            Class.forName(className).methods.filter { m ->
                m.isAnnotationPresent(Page::class.java)
            }.map { page ->
                if (page.returnType == HtmlTag::class.java) {
                    page
                } else {
                    throw PageNotFoundException("Method ${page.name} does not return a HtmlPage")
                }
            }
        } catch (e: Exception) {
            when (e) {
                is ClassNotFoundException -> {
                    throw ClassNotFoundException("Class not found: $className", e)
                }
                else -> throw e
            }
        }
    }.filterNotNull()
}

/**
 * Aggregates the pages into a single page
 * @param [pages] the list of pages
 * @return the single page
 */
fun aggregatePages(pages: List<PageFactory>): HtmlPage {
    return Html {
        Head {
            Script("/scripts/router.js")
            Script("/scripts/requester.js")
            pages.forEach { page ->
                // This script is generated by the server
                // And generates a function that sets the <div id="app"> to the page
                val url = page.getAnnotation(Page::class.java)?.path
                    ?: throw PageLinkageException("Failed to link '${page.name}' to a path.")
                val pageInstance = page.kotlinFunction!!.call(Html {}) as HtmlTag
                Script {
                    "registerPage(\"$url\", () => { return `${pageInstance.innerHtml()}`})"
                }
            }
        }
        Body {
            Div(attributes = Attribute.id("app"))
        }
        Script {
            "loadPage('/')"
        }
    }
}
