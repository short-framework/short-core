package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML border attribute.
 * Description: The border width. Note: This is a legacy attribute. Please use the CSS border property instead..
 * Supported elements: < img>, <object, table >
 */
fun Attribute.Companion.border(value: String) = add("border", value)

/**
 * Represents the HTML border attribute.
 * Description: The border width. Note: This is a legacy attribute. Please use the CSS border property instead..
 * Supported elements: < img>, <object, table >
 */
fun List<Attribute>.border(value: String) = add("border", value)
