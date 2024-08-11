package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML data attribute.
 * Description: Specifies the URL of the resource..
 * Supported elements: <object>
 */
fun Attribute.Companion.`data`(value: String) = add("data", value)

/**
 * Represents the HTML data attribute.
 * Description: Specifies the URL of the resource..
 * Supported elements: <object>
 */
fun List<Attribute>.`data`(value: String) = add("data", value)
