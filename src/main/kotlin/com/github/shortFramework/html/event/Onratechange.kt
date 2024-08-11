package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onratechange event.
 * Description: Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode).
 * @param value script
 */
fun Attribute.Companion.onratechange(value: EventHandler) = add("onratechange", value)

/**
 * Represents the HTML onratechange event.
 * Description: Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode).
 * @param value script
 */
fun List<Attribute>.onratechange(value: EventHandler) = add("onratechange", value)
