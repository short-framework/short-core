package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML style attribute.
 * Description: Defines CSS styles which will override styles previously set..
 * Supported elements: <Global attribute>
 */
fun Attribute.Companion.style(value: String) = add("style", value)

/**
 * Represents the HTML style attribute.
 * Description: Defines CSS styles which will override styles previously set..
 * Supported elements: <Global attribute>
 */
fun List<Attribute>.style(value: String) = add("style", value)
