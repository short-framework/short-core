package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML sizes attribute.
 * Description: .
 * Supported elements: < link>, <img, source >
 */
fun Attribute.Companion.sizes(value: String) = add("sizes", value)

/**
 * Represents the HTML sizes attribute.
 * Description: .
 * Supported elements: < link>, <img, source >
 */
fun List<Attribute>.sizes(value: String) = add("sizes", value)
