package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onsuspend event.
 * Description: Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason.
 * @param value script
 */
fun Attribute.Companion.onsuspend(value: EventHandler) = add("onsuspend", value)

/**
 * Represents the HTML onsuspend event.
 * Description: Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason.
 * @param value script
 */
fun List<Attribute>.onsuspend(value: EventHandler) = add("onsuspend", value)
