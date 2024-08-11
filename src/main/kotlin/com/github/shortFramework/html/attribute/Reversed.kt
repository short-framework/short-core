package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML reversed attribute.
 * Description: Indicates whether the list should be displayed in a descending order instead of an ascending order..
 * Supported elements: <ol>
 */
fun Attribute.Companion.reversed(value: String) = add("reversed", value)

/**
 * Represents the HTML reversed attribute.
 * Description: Indicates whether the list should be displayed in a descending order instead of an ascending order..
 * Supported elements: <ol>
 */
fun List<Attribute>.reversed(value: String) = add("reversed", value)
