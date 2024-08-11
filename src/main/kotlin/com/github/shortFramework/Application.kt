package com.github.shortFramework

import com.github.shortFramework.html.base.element.HtmlScope
import com.github.shortFramework.html.base.element.Tag
import org.http4k.server.Jetty
import org.http4k.server.ServerConfig

open class Application(val args: Array<String>) {
    internal var internalScope: HtmlScope? = null

    fun getScope(): HtmlScope = internalScope ?: throw IllegalStateException("Scope not initialized")

    open fun getPort(): Int = 9000

    open fun getServerConfig(): ServerConfig = Jetty(getPort())

    open fun getLoadingScreen(root: Tag): Tag? = null
}
