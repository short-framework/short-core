package com.github.shortFramework

import io.github.oshai.kotlinlogging.KotlinLogging
import java.net.URL

private val logger = KotlinLogging.logger {}

fun getResource(name: String): URL {
    val resource = object {}.javaClass.getResource(name)
    if (resource != null) {
        return resource
    }
    // Not found
    // Log on the server
    logger.warn { "Resource not found: $name" }
    throw ResourceNotFoundException("Resource not found: $name")
}
