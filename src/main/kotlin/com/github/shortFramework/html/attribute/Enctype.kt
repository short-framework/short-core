package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML enctype attribute.
 * Description: Defines the content type of the form data when the method is POST..
 * Supported elements: <form>
 */
fun Attribute.Companion.enctype(value: String) = add("enctype", value)

/**
 * Represents the HTML enctype attribute.
 * Description: Defines the content type of the form data when the method is POST..
 * Supported elements: <form>
 */
fun List<Attribute>.enctype(value: String) = add("enctype", value)
