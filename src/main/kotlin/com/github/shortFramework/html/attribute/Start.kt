package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML start attribute.
 * Description: Defines the first number if other than 1..
 * Supported elements: <ol>
 */
fun Attribute.Companion.start(value: String) = add("start", value)

/**
 * Represents the HTML start attribute.
 * Description: Defines the first number if other than 1..
 * Supported elements: <ol>
 */
fun List<Attribute>.start(value: String) = add("start", value)
