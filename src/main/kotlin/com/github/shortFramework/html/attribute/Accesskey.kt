package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML accesskey attribute.
 * Description: Keyboard shortcut to activate or add focus to the element..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.accesskey(value: String) = add("accesskey", value)

/**
 * Represents the HTML accesskey attribute.
 * Description: Keyboard shortcut to activate or add focus to the element..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.accesskey(value: String) = add("accesskey", value)
