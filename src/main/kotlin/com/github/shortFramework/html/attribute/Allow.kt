package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML allow attribute.
 * Description: Specifies a feature-policy for the iframe..
 * Supported elements: <iframe>
 */
fun Attribute.Companion.allow(value: String) = add("allow", value)

/**
 * Represents the HTML allow attribute.
 * Description: Specifies a feature-policy for the iframe..
 * Supported elements: <iframe>
 */
fun List<Attribute>.allow(value: String) = add("allow", value)
