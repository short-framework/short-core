package com.github.shortFramework

import java.io.BufferedReader
import java.io.InputStreamReader

object ClassManager {

    private val classLoader: ClassLoader

    init {
        try {
            classLoader = ClassLoader.getSystemClassLoader()
        } catch (e: Exception) {
            when (e) {
                is SecurityException, is IllegalStateException ->
                    throw ClassLoaderException("Couldn't get the system class loader", e)
                else -> throw e
            }
        }
    }

    /**
     * Searches for java classes in a package
     * @param [packageName] the package name where search for classes
     * @return the list of classes in the package
     */
    fun searchClasses(packageName: String): List<String> {
        if (packageName == "META-INF") return emptyList()

        val classpath = packageName.replace(".", "/")
        val resourceStream = classLoader.getResourceAsStream(classpath) ?: return emptyList()
        val lines = BufferedReader(InputStreamReader(resourceStream)).readLines()

        return lines.flatMap { entry: String ->
            return@flatMap if (entry.endsWith(".class")) {
                val prefix = if (packageName.isEmpty()) "" else "$packageName."
                listOf<String>("$prefix${entry.replace(".class", "")}")
            } else {
                searchClasses(if (packageName.isEmpty()) entry else "$packageName.$entry")
            }
        }.toList()
    }
}
