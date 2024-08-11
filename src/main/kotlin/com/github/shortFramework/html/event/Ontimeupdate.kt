package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ontimeupdate event.
 * Description: Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media).
 * @param value script
 */
fun Attribute.Companion.ontimeupdate(value: EventHandler) = add("ontimeupdate", value)

/**
 * Represents the HTML ontimeupdate event.
 * Description: Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media).
 * @param value script
 */
fun List<Attribute>.ontimeupdate(value: EventHandler) = add("ontimeupdate", value)
