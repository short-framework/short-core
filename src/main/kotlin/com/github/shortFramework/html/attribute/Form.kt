package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML form attribute.
 * Description: Indicates the form that is the owner of the element..
 * Supported elements: < button, fieldset, input, label, meter, object, output, progress, select, textarea >
 */
fun Attribute.Companion.form(value: String) = add("form", value)

/**
 * Represents the HTML form attribute.
 * Description: Indicates the form that is the owner of the element..
 * Supported elements: < button, fieldset, input, label, meter, object, output, progress, select, textarea >
 */
fun List<Attribute>.form(value: String) = add("form", value)
