package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML selected attribute.
 * Description: Defines a value which will be selected on page load..
 * Supported elements: <option>
 */
fun Attribute.Companion.selected(value: String) = add("selected", value)

/**
 * Represents the HTML selected attribute.
 * Description: Defines a value which will be selected on page load..
 * Supported elements: <option>
 */
fun List<Attribute>.selected(value: String) = add("selected", value)
