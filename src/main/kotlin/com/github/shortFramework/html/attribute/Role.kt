package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML role attribute.
 * Description: Defines an explicit role for an element for use by assistive technologies..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.role(value: String) = add("role", value)

/**
 * Represents the HTML role attribute.
 * Description: Defines an explicit role for an element for use by assistive technologies..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.role(value: String) = add("role", value)
