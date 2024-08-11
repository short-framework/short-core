package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML loading attribute.
 * Description: Indicates if the element should be loaded lazily (loading="lazy") or loaded immediately (loading="eager")..
 * Supported elements: <img>, <iframe>
 */
fun Attribute.Companion.loading(value: String) = add("loading", value)

/**
 * Represents the HTML loading attribute.
 * Description: Indicates if the element should be loaded lazily (loading="lazy") or loaded immediately (loading="eager")..
 * Supported elements: <img>, <iframe>
 */
fun List<Attribute>.loading(value: String) = add("loading", value)
