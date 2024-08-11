package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <tr> tag.
 * Description: Defines a row of cells in a table. The row's cells can then be established using a mix of td (data cell) and th (header cell) elements.
 */
fun Tag.Tr(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("tr", attributes, scope, content))
}
