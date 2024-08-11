package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML max attribute.
 * Description: Indicates the maximum value allowed..
 * Supported elements: < input, meter, progress >
 */
fun Attribute.Companion.max(value: String) = add("max", value)

/**
 * Represents the HTML max attribute.
 * Description: Indicates the maximum value allowed..
 * Supported elements: < input, meter, progress >
 */
fun List<Attribute>.max(value: String) = add("max", value)
