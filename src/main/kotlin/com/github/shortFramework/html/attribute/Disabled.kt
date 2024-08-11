package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML disabled attribute.
 * Description: Indicates whether the user can interact with the element..
 * Supported elements: < button, fieldset, input, optgroup, option, select, textarea >
 */
fun Attribute.Companion.disabled(value: String) = add("disabled", value)

/**
 * Represents the HTML disabled attribute.
 * Description: Indicates whether the user can interact with the element..
 * Supported elements: < button, fieldset, input, optgroup, option, select, textarea >
 */
fun List<Attribute>.disabled(value: String) = add("disabled", value)
