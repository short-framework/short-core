package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML accept-charset attribute.
 * Description: List of supported charsets..
 * Supported elements: <form>
 */
fun Attribute.Companion.acceptCharset(value: String) = add("accept-charset", value)

/**
 * Represents the HTML accept-charset attribute.
 * Description: List of supported charsets..
 * Supported elements: <form>
 */
fun List<Attribute>.acceptCharset(value: String) = add("accept-charset", value)
