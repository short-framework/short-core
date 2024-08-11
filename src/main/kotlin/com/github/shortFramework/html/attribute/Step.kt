package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML step attribute.
 * Description: .
 * Supported elements: <input>
 */
fun Attribute.Companion.step(value: String) = add("step", value)

/**
 * Represents the HTML step attribute.
 * Description: .
 * Supported elements: <input>
 */
fun List<Attribute>.step(value: String) = add("step", value)
