package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML readonly attribute.
 * Description: Indicates whether the element can be edited..
 * Supported elements: < input, textarea >
 */
fun Attribute.Companion.readonly(value: String) = add("readonly", value)

/**
 * Represents the HTML readonly attribute.
 * Description: Indicates whether the element can be edited..
 * Supported elements: < input, textarea >
 */
fun List<Attribute>.readonly(value: String) = add("readonly", value)
