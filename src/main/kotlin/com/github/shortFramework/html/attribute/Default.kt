package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML default attribute.
 * Description: Indicates that the track should be enabled unless the user's preferences indicate something different..
 * Supported elements: <track>
 */
fun Attribute.Companion.default(value: String) = add("default", value)

/**
 * Represents the HTML default attribute.
 * Description: Indicates that the track should be enabled unless the user's preferences indicate something different..
 * Supported elements: <track>
 */
fun List<Attribute>.default(value: String) = add("default", value)
