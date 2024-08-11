package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML defer attribute.
 * Description: Indicates that the script should be executed after the page has been parsed..
 * Supported elements: <script>
 */
fun Attribute.Companion.defer(value: String) = add("defer", value)

/**
 * Represents the HTML defer attribute.
 * Description: Indicates that the script should be executed after the page has been parsed..
 * Supported elements: <script>
 */
fun List<Attribute>.defer(value: String) = add("defer", value)
