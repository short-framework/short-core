package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML spellcheck attribute.
 * Description: Indicates whether spell checking is allowed for the element..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.spellcheck(value: String) = add("spellcheck", value)

/**
 * Represents the HTML spellcheck attribute.
 * Description: Indicates whether spell checking is allowed for the element..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.spellcheck(value: String) = add("spellcheck", value)
