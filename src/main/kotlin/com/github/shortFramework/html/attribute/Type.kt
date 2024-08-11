package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML type attribute.
 * Description: Defines the type of the element..
 * Supported elements: < button, input, embed, object, ol, script, source, style>, <menu, link >
 */
fun Attribute.Companion.type(value: String) = add("type", value)

/**
 * Represents the HTML type attribute.
 * Description: Defines the type of the element..
 * Supported elements: < button, input, embed, object, ol, script, source, style>, <menu, link >
 */
fun List<Attribute>.type(value: String) = add("type", value)
