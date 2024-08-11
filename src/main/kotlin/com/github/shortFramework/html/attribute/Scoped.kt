package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML scoped attribute.
 * Description: .
 * Supported elements: <style>
 */
fun Attribute.Companion.scoped(value: String) = add("scoped", value)

/**
 * Represents the HTML scoped attribute.
 * Description: .
 * Supported elements: <style>
 */
fun List<Attribute>.scoped(value: String) = add("scoped", value)
