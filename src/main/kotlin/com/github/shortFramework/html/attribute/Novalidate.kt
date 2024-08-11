package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML novalidate attribute.
 * Description: This attribute indicates that the form shouldn't be validated when submitted..
 * Supported elements: <form>
 */
fun Attribute.Companion.novalidate(value: String) = add("novalidate", value)

/**
 * Represents the HTML novalidate attribute.
 * Description: This attribute indicates that the form shouldn't be validated when submitted..
 * Supported elements: <form>
 */
fun List<Attribute>.novalidate(value: String) = add("novalidate", value)
