package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML minlength attribute.
 * Description: Defines the minimum number of characters allowed in the element..
 * Supported elements: < input, textarea >
 */
fun Attribute.Companion.minlength(value: String) = add("minlength", value)

/**
 * Represents the HTML minlength attribute.
 * Description: Defines the minimum number of characters allowed in the element..
 * Supported elements: < input, textarea >
 */
fun List<Attribute>.minlength(value: String) = add("minlength", value)
