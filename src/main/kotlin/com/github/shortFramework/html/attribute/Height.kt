package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML height attribute.
 * Description: Specifies the height of elements listed here. For all other elements, use the CSS height property. Note: In some instances, such as div, this is a legacy attribute, in which case the CSS height property should be used instead..
 * Supported elements: < canvas, embed, iframe>, <img, input, object, video >
 */
fun Attribute.Companion.height(value: String) = add("height", value)

/**
 * Represents the HTML height attribute.
 * Description: Specifies the height of elements listed here. For all other elements, use the CSS height property. Note: In some instances, such as div, this is a legacy attribute, in which case the CSS height property should be used instead..
 * Supported elements: < canvas, embed, iframe>, <img, input, object, video >
 */
fun List<Attribute>.height(value: String) = add("height", value)
