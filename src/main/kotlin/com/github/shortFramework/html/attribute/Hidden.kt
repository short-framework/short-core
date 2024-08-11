package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML hidden attribute.
 * Description: Prevents rendering of given element, while keeping child elements, e.g. script elements, active..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.hidden(value: String) = add("hidden", value)

/**
 * Represents the HTML hidden attribute.
 * Description: Prevents rendering of given element, while keeping child elements, e.g. script elements, active..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.hidden(value: String) = add("hidden", value)
