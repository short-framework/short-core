package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML min attribute.
 * Description: Indicates the minimum value allowed..
 * Supported elements: < input, meter >
 */
fun Attribute.Companion.min(value: String) = add("min", value)

/**
 * Represents the HTML min attribute.
 * Description: Indicates the minimum value allowed..
 * Supported elements: < input, meter >
 */
fun List<Attribute>.min(value: String) = add("min", value)
