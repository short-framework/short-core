package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML wrap attribute.
 * Description: Indicates whether the text should be wrapped..
 * Supported elements: <textarea>
 */
fun Attribute.Companion.wrap(value: String) = add("wrap", value)

/**
 * Represents the HTML wrap attribute.
 * Description: Indicates whether the text should be wrapped..
 * Supported elements: <textarea>
 */
fun List<Attribute>.wrap(value: String) = add("wrap", value)
