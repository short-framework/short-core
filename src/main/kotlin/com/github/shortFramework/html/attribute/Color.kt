package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML color attribute.
 * Description: This attribute sets the text color using either a named color or a color specified in the hexadecimal #RRGGBB format. Note: This is a legacy attribute. Please use the CSS color property instead..
 * Supported elements: <font>, <hr>
 */
fun Attribute.Companion.color(value: String) = add("color", value)

/**
 * Represents the HTML color attribute.
 * Description: This attribute sets the text color using either a named color or a color specified in the hexadecimal #RRGGBB format. Note: This is a legacy attribute. Please use the CSS color property instead..
 * Supported elements: <font>, <hr>
 */
fun List<Attribute>.color(value: String) = add("color", value)
