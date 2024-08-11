package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML srcdoc attribute.
 * Description: .
 * Supported elements: <iframe>
 */
fun Attribute.Companion.srcdoc(value: String) = add("srcdoc", value)

/**
 * Represents the HTML srcdoc attribute.
 * Description: .
 * Supported elements: <iframe>
 */
fun List<Attribute>.srcdoc(value: String) = add("srcdoc", value)
