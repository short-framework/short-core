package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML dirname attribute.
 * Description: .
 * Supported elements: < input, textarea >
 */
fun Attribute.Companion.dirname(value: String) = add("dirname", value)

/**
 * Represents the HTML dirname attribute.
 * Description: .
 * Supported elements: < input, textarea >
 */
fun List<Attribute>.dirname(value: String) = add("dirname", value)
