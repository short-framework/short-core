package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML translate attribute.
 * Description: Specify whether an element's attribute values and the values of its Text node children are to be translated when the page is localized, or whether to leave them unchanged..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.translate(value: String) = add("translate", value)

/**
 * Represents the HTML translate attribute.
 * Description: Specify whether an element's attribute values and the values of its Text node children are to be translated when the page is localized, or whether to leave them unchanged..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.translate(value: String) = add("translate", value)
