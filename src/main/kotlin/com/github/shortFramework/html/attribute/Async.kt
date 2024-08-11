package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML async attribute.
 * Description: Executes the script asynchronously..
 * Supported elements: <script>
 */
fun Attribute.Companion.async(value: String) = add("async", value)

/**
 * Represents the HTML async attribute.
 * Description: Executes the script asynchronously..
 * Supported elements: <script>
 */
fun List<Attribute>.async(value: String) = add("async", value)
