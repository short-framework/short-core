package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML as attribute.
 * Description: Specifies the type of content being loaded by the link..
 * Supported elements: <link>
 */
fun Attribute.Companion.`as`(value: String) = add("as", value)

/**
 * Represents the HTML as attribute.
 * Description: Specifies the type of content being loaded by the link..
 * Supported elements: <link>
 */
fun List<Attribute>.`as`(value: String) = add("as", value)
