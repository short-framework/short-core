package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML id attribute.
 * Description: Often used with CSS to style a specific element. The value of this attribute must be unique..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.id(value: String) = add("id", value)

/**
 * Represents the HTML id attribute.
 * Description: Often used with CSS to style a specific element. The value of this attribute must be unique..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.id(value: String) = add("id", value)
