package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onplaying event.
 * Description: Script to be run when the media actually has started playing.
 * @param value script
 */
fun Attribute.Companion.onplaying(value: EventHandler) = add("onplaying", value)

/**
 * Represents the HTML onplaying event.
 * Description: Script to be run when the media actually has started playing.
 * @param value script
 */
fun List<Attribute>.onplaying(value: EventHandler) = add("onplaying", value)
