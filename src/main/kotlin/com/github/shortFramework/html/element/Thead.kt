package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <thead> tag.
 * Description: Encapsulates a set of table rows (tr elements), indicating that they comprise the head of a table with information about the table's columns. This is usually in the form of column headers (th elements).
 */
fun Tag.Thead(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("thead", attributes, scope, content))
}
