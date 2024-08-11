package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML csp attribute.
 * Description: Specifies the Content Security Policy that an embedded document must agree to enforce upon itself..
 * Supported elements: <iframe>
 */
fun Attribute.Companion.csp(value: String) = add("csp", value)

/**
 * Represents the HTML csp attribute.
 * Description: Specifies the Content Security Policy that an embedded document must agree to enforce upon itself..
 * Supported elements: <iframe>
 */
fun List<Attribute>.csp(value: String) = add("csp", value)
