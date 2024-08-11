package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ismap attribute.
 * Description: Indicates that the image is part of a server-side image map..
 * Supported elements: <img>
 */
fun Attribute.Companion.ismap(value: String) = add("ismap", value)

/**
 * Represents the HTML ismap attribute.
 * Description: Indicates that the image is part of a server-side image map..
 * Supported elements: <img>
 */
fun List<Attribute>.ismap(value: String) = add("ismap", value)
