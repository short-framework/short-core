package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML hreflang attribute.
 * Description: Specifies the language of the linked resource..
 * Supported elements: <a>, <link>
 */
fun Attribute.Companion.hreflang(value: String) = add("hreflang", value)

/**
 * Represents the HTML hreflang attribute.
 * Description: Specifies the language of the linked resource..
 * Supported elements: <a>, <link>
 */
fun List<Attribute>.hreflang(value: String) = add("hreflang", value)
