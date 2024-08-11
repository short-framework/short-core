package com.github.shortFramework.client.`object`

import com.github.shortFramework.client.JavaScript
import com.github.shortFramework.client.JsObject

class Target(private val _value: String, private val script: JavaScript) : JsObject {
    override fun toJs(): String = _value

    val value = script.registerProperty(Any(), "${toJs()}.value;")
}
