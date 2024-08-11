package com.github.shortFramework.html.base.attribute

import com.github.shortFramework.JavaScriptException

interface Attribute {
    val name: String
    val value: Any
    fun toHtml(): String
    companion object
}

fun List<Attribute>.toHtml(): String {
    return this.mapNotNull { attribute ->
        try {
            attribute.toHtml()
        } catch (jse: JavaScriptException) {
            // TODO: Log error on client
            null
        }
    }.joinToString(" ")
}
