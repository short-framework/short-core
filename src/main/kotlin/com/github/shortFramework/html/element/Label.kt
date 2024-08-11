package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <label> tag.
 * Description: Represents a caption for an item in a user interface.
 */
fun Tag.Label(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("label", attributes, scope, content))
}
