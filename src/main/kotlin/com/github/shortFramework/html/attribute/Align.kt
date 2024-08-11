package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML align attribute.
 * Description: Specifies the horizontal alignment of the element..
 * Supported elements: < caption>, <col, colgroup, hr>, <iframe, img>, <table, tbody>, <td, tfoot>, <th, thead>, <tr >
 */
fun Attribute.Companion.align(value: String) = add("align", value)

/**
 * Represents the HTML align attribute.
 * Description: Specifies the horizontal alignment of the element..
 * Supported elements: < caption>, <col, colgroup, hr>, <iframe, img>, <table, tbody>, <td, tfoot>, <th, thead>, <tr >
 */
fun List<Attribute>.align(value: String) = add("align", value)
