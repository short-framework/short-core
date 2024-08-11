package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML http-equiv attribute.
 * Description: Defines a pragma directive..
 * Supported elements: <meta>
 */
fun Attribute.Companion.httpEquiv(value: String) = add("http-equiv", value)

/**
 * Represents the HTML http-equiv attribute.
 * Description: Defines a pragma directive..
 * Supported elements: <meta>
 */
fun List<Attribute>.httpEquiv(value: String) = add("http-equiv", value)
