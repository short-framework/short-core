package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <table> tag.
 * Description: Represents tabular data—that is, information presented in a two-dimensional table comprised of rows and columns of cells containing data.
 */
fun Tag.Table(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("table", attributes, scope, content))
}
