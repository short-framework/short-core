package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML class attribute.
 * Description: Often used with CSS to style elements with common properties..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.`class`(value: String) = add("class", value)

/**
 * Represents the HTML class attribute.
 * Description: Often used with CSS to style elements with common properties..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.`class`(value: String) = add("class", value)
