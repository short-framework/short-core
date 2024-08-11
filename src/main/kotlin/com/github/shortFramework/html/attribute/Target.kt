package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML target attribute.
 * Description: Specifies where to open the linked document (in the case of an a element) or where to display the response received (in the case of a form element).
 * Supported elements: < a>, <area, base>, <form >
 */
fun Attribute.Companion.target(value: String) = add("target", value)

/**
 * Represents the HTML target attribute.
 * Description: Specifies where to open the linked document (in the case of an a element) or where to display the response received (in the case of a form element).
 * Supported elements: < a>, <area, base>, <form >
 */
fun List<Attribute>.target(value: String) = add("target", value)
