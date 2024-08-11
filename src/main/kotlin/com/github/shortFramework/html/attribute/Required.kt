package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML required attribute.
 * Description: Indicates whether this element is required to fill out or not..
 * Supported elements: < input, select, textarea >
 */
fun Attribute.Companion.required(value: String) = add("required", value)

/**
 * Represents the HTML required attribute.
 * Description: Indicates whether this element is required to fill out or not..
 * Supported elements: < input, select, textarea >
 */
fun List<Attribute>.required(value: String) = add("required", value)
