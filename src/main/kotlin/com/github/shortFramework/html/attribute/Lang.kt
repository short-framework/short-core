package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML lang attribute.
 * Description: Defines the language used in the element..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.lang(value: String) = add("lang", value)

/**
 * Represents the HTML lang attribute.
 * Description: Defines the language used in the element..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.lang(value: String) = add("lang", value)
