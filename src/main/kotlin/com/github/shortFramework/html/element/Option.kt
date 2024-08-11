package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <option> tag.
 * Description: Used to define an item contained in a select, an optgroup, or a datalist element. As such, option can represent menu items in popups and other lists of items in an HTML document.
 */
fun Tag.Option(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("option", attributes, scope, content))
}
