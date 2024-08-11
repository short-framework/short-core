package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML controls attribute.
 * Description: Indicates whether the browser should show playback controls to the user..
 * Supported elements: < audio, video >
 */
fun Attribute.Companion.controls(value: String) = add("controls", value)

/**
 * Represents the HTML controls attribute.
 * Description: Indicates whether the browser should show playback controls to the user..
 * Supported elements: < audio, video >
 */
fun List<Attribute>.controls(value: String) = add("controls", value)
