package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML label attribute.
 * Description: Specifies a user-readable title of the element..
 * Supported elements: < optgroup, option, track >
 */
fun Attribute.Companion.label(value: String) = add("label", value)

/**
 * Represents the HTML label attribute.
 * Description: Specifies a user-readable title of the element..
 * Supported elements: < optgroup, option, track >
 */
fun List<Attribute>.label(value: String) = add("label", value)
