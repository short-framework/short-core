package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML low attribute.
 * Description: Indicates the upper bound of the lower range..
 * Supported elements: <meter>
 */
fun Attribute.Companion.low(value: String) = add("low", value)

/**
 * Represents the HTML low attribute.
 * Description: Indicates the upper bound of the lower range..
 * Supported elements: <meter>
 */
fun List<Attribute>.low(value: String) = add("low", value)
