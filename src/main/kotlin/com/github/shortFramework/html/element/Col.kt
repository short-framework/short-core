package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.VoidTag

/**
 * Represents the HTML <col> tag.
 * Description: Defines one or more columns in a column group represented by its implicit or explicit parent colgroup element. The col element is only valid as a child of a colgroup element that has no span attribute defined.
 */
fun Tag.Col(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(VoidTag("col", attributes, scope))
}
