package com.github.shortFramework.html.base

import com.github.shortFramework.client.JavaScript
import com.github.shortFramework.client.JsHandler
import com.github.shortFramework.client.JsScope
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <script> tag.
 * Description: Used to embed executable code or data; this is typically used to embed or refer to JavaScript code. The script element can also be used with other languages, such as WebGL's GLSL shader programming language and JSON.
 */
fun Tag.Script(attributes: List<Attribute> = emptyList(), content: JsHandler? = null): Tag = apply {
    val html: HtmlReceiver = {
        JsScope(JavaScript(this)) {
            content?.invoke(this)
            Text {
                toHtml()
            }
        }
    }
    appendChild(prototype("script", attributes, scope, html))
}
