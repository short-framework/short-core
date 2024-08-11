package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML cols attribute.
 * Description: Defines the number of columns in a textarea..
 * Supported elements: <textarea>
 */
fun Attribute.Companion.cols(value: String) = add("cols", value)

/**
 * Represents the HTML cols attribute.
 * Description: Defines the number of columns in a textarea..
 * Supported elements: <textarea>
 */
fun List<Attribute>.cols(value: String) = add("cols", value)
