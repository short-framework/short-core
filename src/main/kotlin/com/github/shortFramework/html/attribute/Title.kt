package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML title attribute.
 * Description: Text to be displayed in a tooltip when hovering over the element..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.title(value: String) = add("title", value)

/**
 * Represents the HTML title attribute.
 * Description: Text to be displayed in a tooltip when hovering over the element..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.title(value: String) = add("title", value)
