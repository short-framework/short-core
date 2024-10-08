package com.github.shortFramework

import com.github.shortFramework.comms.executeContract
import com.github.shortFramework.html.base.Body
import com.github.shortFramework.html.base.Html
import com.github.shortFramework.html.base.element.Tag
import io.github.oshai.kotlinlogging.KotlinLogging
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.then
import org.http4k.filter.CachingFilters
import org.http4k.routing.ResourceLoader.Companion.Classpath
import org.http4k.routing.bind
import org.http4k.routing.path
import org.http4k.routing.routes
import org.http4k.routing.singlePageApp
import org.http4k.routing.static
import org.http4k.server.Http4kServer
import org.http4k.server.asServer

private val logger = KotlinLogging.logger {}

typealias WebApp = Html

/**
 * Top level function acting as a Kotlin shortcut allowing to write
 * `runApplication<FooApplication>(args)` instead of
 * `runApplication(FooApplication::class.java, args)`.
 */

@Suppress("UNCHECKED_CAST")
inline fun <reified T : Application> runSHORT(args: Array<String>) {
    // This cast should always succeed since T is a subclass of Application
    runSHORT(T::class.java as Class<Application>, args)
}

/**
 * Starts a SHORT application using the given [sourceManagerClass] and [args].
 * The [sourceManagerClass] must be a subclass of [Application].
 * Create a new instance of [sourceManagerClass]. The context will be loaded from the overridden methods
 * The instance can have more function that will be used to inject dependencies in the pages
 * @return the server that is running the application.
 */
fun runSHORT(sourceManagerClass: Class<Application>, args: Array<String>): Http4kServer {
    // Instantiate the sources manager
    logger.debug { "Initializing sources manager..." }
    val sourceManager: Application

    try {
        sourceManager =
            sourceManagerClass
                .getDeclaredConstructor(
                    emptyArray<String>().javaClass
                )
                .newInstance(args)
    } catch (e: Exception) {
        throw RuntimeException("Couldn't create an instance of the source manager", e)
    }

    // Declare public content
    // TODO: Verify this does allow hack it to access all files in /resources
    val public = routes(
        "/" bind CachingFilters.Response.NoCache()
            .then(static(Classpath("public/")))
    )

    // Generate the loading page
    logger.debug { "Generating loading page..." }
    var loadingScreen: Tag? = null
    val root = Html {
        Body {
            loadingScreen = sourceManager.getLoadingScreen(this)
        }
    }

    val loadingStatus = Status(200, "Loading...")
    val loadingPage = if (loadingScreen == null) {
        { _: Request -> Response(loadingStatus).body("Server is starting.").header("Status", "Loading...") }
    } else {
        { _: Request -> Response(loadingStatus).body(root.toHtml()) }
    }

    val port = sourceManager.getPort()

    // Register loading page
    val serverConfig = sourceManager.getServerConfig()
    logger.debug { "Registering loading page..." }
    val loadingPath = routes(
        public,
        "/" bind Method.GET to loadingPage,
        singlePageApp(SpaLoader(port))
    )

    // Launch temporary server
    logger.debug { "Starting temporary server..." }
    val tempServer = loadingPath.asServer(serverConfig).start()
    logger.info { "Temporary server started at port ${tempServer.port()}." }

    // DON'T START THE SERVER IF DEBUG_TEMPORARY_SERVER IS SET
    if (args.contains("INIT_DELAY")) {
        logger.debug { "Waiting for user input to start server..." }
        readlnOrNull()
    }

    // Generate the web app
    logger.debug { "Generating web app..." }
    val webApp = generateWebApp(sourceManager)

    // Register new routes
    logger.debug { "Registering exposed paths..." }

    val exposedPaths = routes(
        public,
        "api/contract/{id}" bind { request: Request ->
            val id = request.path("id")
            logger.debug { "Received request with id $id" }
            if (id == null) {
                Response(Status.BAD_REQUEST).body("Missing id")
            } else {
                try {
                    executeContract(request, id.toInt())
                } catch (_: IndexOutOfBoundsException) {
                    Response(Status.NOT_FOUND).body("Contract not found for id $id.")
                } catch (e: Exception) {
                    logger.error(e) { "Internal server error" }
                    Response(Status.INTERNAL_SERVER_ERROR).body("Internal server error")
                }
            }
        },
        "/" bind Method.GET to { _: Request ->
            Response(Status.OK).body(webApp.toHtml())
        },
        singlePageApp(SpaLoader(port))
    )

    // Stop the temporary server
    logger.debug { "Stopping temporary server..." }
    tempServer.stop()

    // Launch definitive server
    logger.debug { "Starting definitive server..." }
    val server = exposedPaths.asServer(serverConfig).start()
    logger.info { "Server started at port ${server.port()}." }

    return server
}
