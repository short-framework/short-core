package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML playsinline attribute.
 * Description: A Boolean attribute indicating that the video is to be played "inline"; that is, within the element's playback area. Note that the absence of this attribute does not imply that the video will always be played in fullscreen..
 * Supported elements: <video>
 */
fun Attribute.Companion.playsinline(value: String) = add("playsinline", value)

/**
 * Represents the HTML playsinline attribute.
 * Description: A Boolean attribute indicating that the video is to be played "inline"; that is, within the element's playback area. Note that the absence of this attribute does not imply that the video will always be played in fullscreen..
 * Supported elements: <video>
 */
fun List<Attribute>.playsinline(value: String) = add("playsinline", value)
