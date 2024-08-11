package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML autocapitalize attribute.
 * Description: Sets whether input is automatically capitalized when entered by user.
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.autocapitalize(value: String) = add("autocapitalize", value)

/**
 * Represents the HTML autocapitalize attribute.
 * Description: Sets whether input is automatically capitalized when entered by user.
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.autocapitalize(value: String) = add("autocapitalize", value)
