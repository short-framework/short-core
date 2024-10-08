package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML decoding attribute.
 * Description: Indicates the preferred method to decode the image..
 * Supported elements: <img>
 */
fun Attribute.Companion.decoding(value: String) = add("decoding", value)

/**
 * Represents the HTML decoding attribute.
 * Description: Indicates the preferred method to decode the image..
 * Supported elements: <img>
 */
fun List<Attribute>.decoding(value: String) = add("decoding", value)
