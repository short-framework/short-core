package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <mark> tag.
 * Description: Represents text which is marked or highlighted for reference or notation purposes due to the marked passage's relevance in the enclosing context.
 */
fun Tag.Mark(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("mark", attributes, scope, content))
}
