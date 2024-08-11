package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML shape attribute.
 * Description: .
 * Supported elements: <a>, <area>
 */
fun Attribute.Companion.shape(value: String) = add("shape", value)

/**
 * Represents the HTML shape attribute.
 * Description: .
 * Supported elements: <a>, <area>
 */
fun List<Attribute>.shape(value: String) = add("shape", value)
