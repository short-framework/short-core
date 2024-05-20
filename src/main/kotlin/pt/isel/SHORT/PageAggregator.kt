package pt.isel.SHORT

import pt.isel.SHORT.html.attribute.href
import pt.isel.SHORT.html.attribute.id
import pt.isel.SHORT.html.attribute.rel
import pt.isel.SHORT.html.attribute.src
import pt.isel.SHORT.html.attribute.type
import pt.isel.SHORT.html.base.Body
import pt.isel.SHORT.html.base.Head
import pt.isel.SHORT.html.base.Html
import pt.isel.SHORT.html.base.Text
import pt.isel.SHORT.html.base.attribute.Attribute
import pt.isel.SHORT.html.base.css.Import
import pt.isel.SHORT.html.base.element.Tag
import pt.isel.SHORT.html.element.Link
import pt.isel.SHORT.html.element.Script
import pt.isel.SHORT.html.element.Template
import pt.isel.SHORT.serverEvents.onRequest
import java.lang.reflect.Method
import kotlin.reflect.jvm.kotlinFunction

/**
 * This annotation is used to represent a page in the web application
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class Page(val path: String)

/**
 * This allows to define the aggregation mode of the pages
 * LEGACY: The pages are loaded using a script that generates the page
 * TEMPLATE: The pages are loaded using <template> tags
 */
enum class AggregationMode {
    LEGACY,
    TEMPLATE
}

/**
 * This represents the functions that generate pages
 */
typealias PageFactory = Method

/**
 * Generates a [WebApp] from the functions annotated with [Page]
 * @return a [WebApp] with a single page that contains the whole single page application
 */
fun generateWebApp(): WebApp {
    val classNames = ClassManager.searchClasses("")
    return aggregatePages(getPages(classNames))
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
                if (page.returnType == Tag::class.java) {
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
fun aggregatePages(pages: List<PageFactory>): Html {
    val uniqueImports: MutableList<Import> = mutableListOf()
    return Html {
        Head {
            onRequest {
                when (this@Html.aggregationMode) {
                    AggregationMode.TEMPLATE -> {
                        Script(attributes = Attribute.src("/scripts/templateChecker.js"))
                        Script(attributes = Attribute.src("/scripts/router.js"))
                    }
                    else ->
                        Script(attributes = Attribute.src("/scripts/router-legacy.js"))
                }
            }
            // Script(attributes = Attribute.src("/scripts/requester.js"))

            pages.forEach { page ->
                // This script is generated by the server
                // And generates a function that sets the <div id="app"> to the page
                val url = page.getAnnotation(Page::class.java)?.path
                    ?: throw PageLinkageException("Failed to link '${page.name}' to a path.")
                val pageInstance = page.kotlinFunction!!.call(Html().tag) as Tag
                onRequest {
                    Template(
                        attributes = Attribute.id("page-$url")
                    ) {
                        Text { pageInstance.innerHtml() }
                    }
                }

                val imports: List<Import> = page.getAnnotationsByType(Import::class.java).toList()

                imports.forEach { import ->
                    val uniquePaths = uniqueImports.map { unique -> unique.path }
                    if (import.path !in uniquePaths) {
                        uniqueImports.add(import)
                    }
                }
            }
            uniqueImports.forEach { import ->
                val attributes = Attribute.type(import.type).href(import.path)
                val finalAttributes = if (import.relation.isNotBlank()) {
                    attributes.rel(import.relation)
                } else {
                    attributes
                }
                Link(finalAttributes)
            }
        }
        Body()
    }
}
