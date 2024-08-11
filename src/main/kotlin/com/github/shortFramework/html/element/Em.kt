package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <em> tag.
 * Description: Marks text that has stress emphasis. The em element can be nested, with each nesting level indicating a greater degree of emphasis.
 */
fun Tag.Em(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("em", attributes, scope, content))
}
