package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML srcset attribute.
 * Description: One or more responsive image candidates..
 * Supported elements: <img>, <source>
 */
fun Attribute.Companion.srcset(value: String) = add("srcset", value)

/**
 * Represents the HTML srcset attribute.
 * Description: One or more responsive image candidates..
 * Supported elements: <img>, <source>
 */
fun List<Attribute>.srcset(value: String) = add("srcset", value)
