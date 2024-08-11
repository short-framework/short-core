package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML method attribute.
 * Description: Defines which HTTP method to use when submitting the form. Can be GET (default) or POST..
 * Supported elements: <form>
 */
fun Attribute.Companion.method(value: String) = add("method", value)

/**
 * Represents the HTML method attribute.
 * Description: Defines which HTTP method to use when submitting the form. Can be GET (default) or POST..
 * Supported elements: <form>
 */
fun List<Attribute>.method(value: String) = add("method", value)
