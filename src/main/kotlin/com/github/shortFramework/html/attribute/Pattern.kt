package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML pattern attribute.
 * Description: Defines a regular expression which the element's value will be validated against..
 * Supported elements: <input>
 */
fun Attribute.Companion.pattern(value: String) = add("pattern", value)

/**
 * Represents the HTML pattern attribute.
 * Description: Defines a regular expression which the element's value will be validated against..
 * Supported elements: <input>
 */
fun List<Attribute>.pattern(value: String) = add("pattern", value)
