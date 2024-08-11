package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML multiple attribute.
 * Description: Indicates whether multiple values can be entered in an input of the type email or file..
 * Supported elements: < input, select >
 */
fun Attribute.Companion.multiple(value: String) = add("multiple", value)

/**
 * Represents the HTML multiple attribute.
 * Description: Indicates whether multiple values can be entered in an input of the type email or file..
 * Supported elements: < input, select >
 */
fun List<Attribute>.multiple(value: String) = add("multiple", value)
