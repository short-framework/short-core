package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML sandbox attribute.
 * Description: Stops a document loaded in an iframe from using certain features (such as submitting forms or opening new windows)..
 * Supported elements: <iframe>
 */
fun Attribute.Companion.sandbox(value: String) = add("sandbox", value)

/**
 * Represents the HTML sandbox attribute.
 * Description: Stops a document loaded in an iframe from using certain features (such as submitting forms or opening new windows)..
 * Supported elements: <iframe>
 */
fun List<Attribute>.sandbox(value: String) = add("sandbox", value)
