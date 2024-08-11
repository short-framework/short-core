package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <canvas> tag.
 * Description: Container element to use with either the canvas scripting API or the WebGL API to draw graphics and animations.
 */
fun Tag.Canvas(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("canvas", attributes, scope, content))
}
