package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML usemap attribute.
 * Description: .
 * Supported elements: < img>, <input, object >
 */
fun Attribute.Companion.usemap(value: String) = add("usemap", value)

/**
 * Represents the HTML usemap attribute.
 * Description: .
 * Supported elements: < img>, <input, object >
 */
fun List<Attribute>.usemap(value: String) = add("usemap", value)
