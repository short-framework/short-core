package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML action attribute.
 * Description: The URI of a program that processes the information submitted via the form..
 * Supported elements: <form>
 */
fun Attribute.Companion.action(value: String) = add("action", value)

/**
 * Represents the HTML action attribute.
 * Description: The URI of a program that processes the information submitted via the form..
 * Supported elements: <form>
 */
fun List<Attribute>.action(value: String) = add("action", value)
