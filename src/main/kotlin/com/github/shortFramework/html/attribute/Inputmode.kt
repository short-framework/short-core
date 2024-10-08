package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML inputmode attribute.
 * Description: Provides a hint as to the type of data that might be entered by the user while editing the element or its contents. The attribute can be used with form controls (such as the value of textarea elements), or in elements in an editing host (e.g., using contenteditable attribute)..
 * Supported elements: < textarea, contenteditable >
 */
fun Attribute.Companion.inputmode(value: String) = add("inputmode", value)

/**
 * Represents the HTML inputmode attribute.
 * Description: Provides a hint as to the type of data that might be entered by the user while editing the element or its contents. The attribute can be used with form controls (such as the value of textarea elements), or in elements in an editing host (e.g., using contenteditable attribute)..
 * Supported elements: < textarea, contenteditable >
 */
fun List<Attribute>.inputmode(value: String) = add("inputmode", value)
