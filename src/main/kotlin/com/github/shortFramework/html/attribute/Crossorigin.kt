package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML crossorigin attribute.
 * Description: How the element handles cross-origin requests.
 * Supported elements: < audio>, <img, link>, <script, video >
 */
fun Attribute.Companion.crossorigin(value: String) = add("crossorigin", value)

/**
 * Represents the HTML crossorigin attribute.
 * Description: How the element handles cross-origin requests.
 * Supported elements: < audio>, <img, link>, <script, video >
 */
fun List<Attribute>.crossorigin(value: String) = add("crossorigin", value)
