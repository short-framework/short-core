package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML width attribute.
 * Description: For the elements listed here, this establishes the element's width. Note: For all other instances, such as div, this is a legacy attribute, in which case the CSS width property should be used instead..
 * Supported elements: < canvas, embed, iframe>, <img, input, object, video >
 */
fun Attribute.Companion.width(value: String) = add("width", value)

/**
 * Represents the HTML width attribute.
 * Description: For the elements listed here, this establishes the element's width. Note: For all other instances, such as div, this is a legacy attribute, in which case the CSS width property should be used instead..
 * Supported elements: < canvas, embed, iframe>, <img, input, object, video >
 */
fun List<Attribute>.width(value: String) = add("width", value)
