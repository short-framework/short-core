package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML contenteditable attribute.
 * Description: Indicates whether the element's content is editable..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.contenteditable(value: String) = add("contenteditable", value)

/**
 * Represents the HTML contenteditable attribute.
 * Description: Indicates whether the element's content is editable..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.contenteditable(value: String) = add("contenteditable", value)
