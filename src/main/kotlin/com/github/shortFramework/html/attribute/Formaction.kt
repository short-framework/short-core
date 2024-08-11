package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML formaction attribute.
 * Description: Indicates the action of the element, overriding the action defined in the form..
 * Supported elements: < input, button >
 */
fun Attribute.Companion.formaction(value: String) = add("formaction", value)

/**
 * Represents the HTML formaction attribute.
 * Description: Indicates the action of the element, overriding the action defined in the form..
 * Supported elements: < input, button >
 */
fun List<Attribute>.formaction(value: String) = add("formaction", value)
