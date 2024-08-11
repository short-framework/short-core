package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML headers attribute.
 * Description: IDs of the th elements which applies to this element..
 * Supported elements: <td>, <th>
 */
fun Attribute.Companion.headers(value: String) = add("headers", value)

/**
 * Represents the HTML headers attribute.
 * Description: IDs of the th elements which applies to this element..
 * Supported elements: <td>, <th>
 */
fun List<Attribute>.headers(value: String) = add("headers", value)
