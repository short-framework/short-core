package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <tbody> tag.
 * Description: Encapsulates a set of table rows (tr elements), indicating that they comprise the body of a table's (main) data.
 */
fun Tag.Tbody(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("tbody", attributes, scope, content))
}
