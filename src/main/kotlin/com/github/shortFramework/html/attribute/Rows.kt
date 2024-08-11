package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML rows attribute.
 * Description: Defines the number of rows in a text area..
 * Supported elements: <textarea>
 */
fun Attribute.Companion.rows(value: String) = add("rows", value)

/**
 * Represents the HTML rows attribute.
 * Description: Defines the number of rows in a text area..
 * Supported elements: <textarea>
 */
fun List<Attribute>.rows(value: String) = add("rows", value)
