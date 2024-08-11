package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML optimum attribute.
 * Description: Indicates the optimal numeric value..
 * Supported elements: <meter>
 */
fun Attribute.Companion.optimum(value: String) = add("optimum", value)

/**
 * Represents the HTML optimum attribute.
 * Description: Indicates the optimal numeric value..
 * Supported elements: <meter>
 */
fun List<Attribute>.optimum(value: String) = add("optimum", value)
