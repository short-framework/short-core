package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML srclang attribute.
 * Description: .
 * Supported elements: <track>
 */
fun Attribute.Companion.srclang(value: String) = add("srclang", value)

/**
 * Represents the HTML srclang attribute.
 * Description: .
 * Supported elements: <track>
 */
fun List<Attribute>.srclang(value: String) = add("srclang", value)
