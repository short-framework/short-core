package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML span attribute.
 * Description: .
 * Supported elements: < col, colgroup >
 */
fun Attribute.Companion.span(value: String) = add("span", value)

/**
 * Represents the HTML span attribute.
 * Description: .
 * Supported elements: < col, colgroup >
 */
fun List<Attribute>.span(value: String) = add("span", value)
