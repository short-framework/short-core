package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onplay event.
 * Description: Script to be run when the media is ready to start playing.
 * @param value script
 */
fun Attribute.Companion.onplay(value: EventHandler) = add("onplay", value)

/**
 * Represents the HTML onplay event.
 * Description: Script to be run when the media is ready to start playing.
 * @param value script
 */
fun List<Attribute>.onplay(value: EventHandler) = add("onplay", value)
