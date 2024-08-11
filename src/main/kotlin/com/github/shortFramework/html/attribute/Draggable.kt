package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML draggable attribute.
 * Description: Defines whether the element can be dragged..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.draggable(value: String) = add("draggable", value)

/**
 * Represents the HTML draggable attribute.
 * Description: Defines whether the element can be dragged..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.draggable(value: String) = add("draggable", value)
