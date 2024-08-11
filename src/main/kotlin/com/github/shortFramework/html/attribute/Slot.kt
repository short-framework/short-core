package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML slot attribute.
 * Description: Assigns a slot in a shadow DOM shadow tree to an element..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.slot(value: String) = add("slot", value)

/**
 * Represents the HTML slot attribute.
 * Description: Assigns a slot in a shadow DOM shadow tree to an element..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.slot(value: String) = add("slot", value)
