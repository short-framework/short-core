package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML autoplay attribute.
 * Description: The audio or video should play as soon as possible..
 * Supported elements: < audio, video >
 */
fun Attribute.Companion.autoplay(value: String) = add("autoplay", value)

/**
 * Represents the HTML autoplay attribute.
 * Description: The audio or video should play as soon as possible..
 * Supported elements: < audio, video >
 */
fun List<Attribute>.autoplay(value: String) = add("autoplay", value)
