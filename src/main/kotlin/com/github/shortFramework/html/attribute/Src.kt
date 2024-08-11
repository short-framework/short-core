package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML src attribute.
 * Description: The URL of the embeddable content..
 * Supported elements: < audio, embed, iframe>, <img, input, script, source, track, video >
 */
fun Attribute.Companion.src(value: String) = add("src", value)

/**
 * Represents the HTML src attribute.
 * Description: The URL of the embeddable content..
 * Supported elements: < audio, embed, iframe>, <img, input, script, source, track, video >
 */
fun List<Attribute>.src(value: String) = add("src", value)
