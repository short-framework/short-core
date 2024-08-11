package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML datetime attribute.
 * Description: Indicates the date and time associated with the element..
 * Supported elements: < del>, <ins, time >
 */
fun Attribute.Companion.datetime(value: String) = add("datetime", value)

/**
 * Represents the HTML datetime attribute.
 * Description: Indicates the date and time associated with the element..
 * Supported elements: < del>, <ins, time >
 */
fun List<Attribute>.datetime(value: String) = add("datetime", value)
