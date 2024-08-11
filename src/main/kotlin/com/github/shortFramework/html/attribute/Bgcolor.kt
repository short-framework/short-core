package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML bgcolor attribute.
 * Description: Background color of the element. Note: This is a legacy attribute. Please use the CSS background-color property instead..
 * Supported elements: < body>, <col, colgroup, marquee, table, tbody, tfoot>, <td, th>, <tr >
 */
fun Attribute.Companion.bgcolor(value: String) = add("bgcolor", value)

/**
 * Represents the HTML bgcolor attribute.
 * Description: Background color of the element. Note: This is a legacy attribute. Please use the CSS background-color property instead..
 * Supported elements: < body>, <col, colgroup, marquee, table, tbody, tfoot>, <td, th>, <tr >
 */
fun List<Attribute>.bgcolor(value: String) = add("bgcolor", value)
