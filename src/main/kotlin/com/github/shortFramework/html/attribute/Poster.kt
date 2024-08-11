package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML poster attribute.
 * Description: A URL indicating a poster frame to show until the user plays or seeks..
 * Supported elements: <video>
 */
fun Attribute.Companion.poster(value: String) = add("poster", value)

/**
 * Represents the HTML poster attribute.
 * Description: A URL indicating a poster frame to show until the user plays or seeks..
 * Supported elements: <video>
 */
fun List<Attribute>.poster(value: String) = add("poster", value)
