package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML dir attribute.
 * Description: Defines the text direction. Allowed values are ltr (Left-To-Right) or rtl (Right-To-Left).
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.dir(value: String) = add("dir", value)

/**
 * Represents the HTML dir attribute.
 * Description: Defines the text direction. Allowed values are ltr (Left-To-Right) or rtl (Right-To-Left).
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.dir(value: String) = add("dir", value)
