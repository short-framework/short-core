package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <s> tag.
 * Description: Renders text with a strikethrough, or a line through it. Use the s element to represent things that are no longer relevant or no longer accurate. However, s is not appropriate when indicating document edits; for that, use the del and ins elements, as appropriate.
 */
fun Tag.S(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("s", attributes, scope, content))
}
