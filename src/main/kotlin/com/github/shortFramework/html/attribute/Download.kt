package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML download attribute.
 * Description: Indicates that the hyperlink is to be used for downloading a resource..
 * Supported elements: <a>, <area>
 */
fun Attribute.Companion.download(value: String) = add("download", value)

/**
 * Represents the HTML download attribute.
 * Description: Indicates that the hyperlink is to be used for downloading a resource..
 * Supported elements: <a>, <area>
 */
fun List<Attribute>.download(value: String) = add("download", value)
