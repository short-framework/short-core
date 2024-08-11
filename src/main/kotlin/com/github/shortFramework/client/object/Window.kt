package com.github.shortFramework.client.`object`

import com.github.shortFramework.client.JavaScript
import com.github.shortFramework.client.JsObject

class Window(script: JavaScript) : JsObject {
    override fun toJs(): String = "window"

    val localStorage = Storage("${toJs()}.localStorage", script)
    val sessionStorage = Storage("${toJs()}.sessionStorage", script)
}
