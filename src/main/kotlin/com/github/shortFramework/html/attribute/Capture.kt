package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML capture attribute.
 * Description: From the Media Capture specification, specifies a new file can be captured..
 * Supported elements: <input>
 */
fun Attribute.Companion.capture(value: String) = add("capture", value)

/**
 * Represents the HTML capture attribute.
 * Description: From the Media Capture specification, specifies a new file can be captured..
 * Supported elements: <input>
 */
fun List<Attribute>.capture(value: String) = add("capture", value)
