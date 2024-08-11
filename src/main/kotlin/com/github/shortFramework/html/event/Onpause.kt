package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onpause event.
 * Description: Script to be run when the media is paused either by the user or programmatically.
 * @param value script
 */
fun Attribute.Companion.onpause(value: EventHandler) = add("onpause", value)

/**
 * Represents the HTML onpause event.
 * Description: Script to be run when the media is paused either by the user or programmatically.
 * @param value script
 */
fun List<Attribute>.onpause(value: EventHandler) = add("onpause", value)
