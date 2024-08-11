package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML itemprop attribute.
 * Description: .
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.itemprop(value: String) = add("itemprop", value)

/**
 * Represents the HTML itemprop attribute.
 * Description: .
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.itemprop(value: String) = add("itemprop", value)
