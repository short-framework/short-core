package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML checked attribute.
 * Description: Indicates whether the element should be checked on page load..
 * Supported elements: <input>
 */
fun Attribute.Companion.checked(value: String) = add("checked", value)

/**
 * Represents the HTML checked attribute.
 * Description: Indicates whether the element should be checked on page load..
 * Supported elements: <input>
 */
fun List<Attribute>.checked(value: String) = add("checked", value)
