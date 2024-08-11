package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML high attribute.
 * Description: Indicates the lower bound of the upper range..
 * Supported elements: <meter>
 */
fun Attribute.Companion.high(value: String) = add("high", value)

/**
 * Represents the HTML high attribute.
 * Description: Indicates the lower bound of the upper range..
 * Supported elements: <meter>
 */
fun List<Attribute>.high(value: String) = add("high", value)
