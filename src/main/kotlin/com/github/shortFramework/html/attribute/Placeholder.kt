package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML placeholder attribute.
 * Description: Provides a hint to the user of what can be entered in the field..
 * Supported elements: < input, textarea >
 */
fun Attribute.Companion.placeholder(value: String) = add("placeholder", value)

/**
 * Represents the HTML placeholder attribute.
 * Description: Provides a hint to the user of what can be entered in the field..
 * Supported elements: < input, textarea >
 */
fun List<Attribute>.placeholder(value: String) = add("placeholder", value)
