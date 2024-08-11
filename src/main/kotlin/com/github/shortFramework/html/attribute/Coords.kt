package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML coords attribute.
 * Description: A set of values specifying the coordinates of the hot-spot region..
 * Supported elements: <area>
 */
fun Attribute.Companion.coords(value: String) = add("coords", value)

/**
 * Represents the HTML coords attribute.
 * Description: A set of values specifying the coordinates of the hot-spot region..
 * Supported elements: <area>
 */
fun List<Attribute>.coords(value: String) = add("coords", value)
