package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML for attribute.
 * Description: Describes elements which belongs to this one..
 * Supported elements: < label, output >
 */
fun Attribute.Companion.`for`(value: String) = add("for", value)

/**
 * Represents the HTML for attribute.
 * Description: Describes elements which belongs to this one..
 * Supported elements: < label, output >
 */
fun List<Attribute>.`for`(value: String) = add("for", value)
