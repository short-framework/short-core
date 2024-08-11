package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML media attribute.
 * Description: Specifies a hint of the media for which the linked resource was designed..
 * Supported elements: < a>, <area, link>, <source, style >
 */
fun Attribute.Companion.media(value: String) = add("media", value)

/**
 * Represents the HTML media attribute.
 * Description: Specifies a hint of the media for which the linked resource was designed..
 * Supported elements: < a>, <area, link>, <source, style >
 */
fun List<Attribute>.media(value: String) = add("media", value)
