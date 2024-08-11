package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onvolumechange event.
 * Description: Script to be run each time the volume is changed which (includes setting the volume to mute).
 * @param value script
 */
fun Attribute.Companion.onvolumechange(value: EventHandler) = add("onvolumechange", value)

/**
 * Represents the HTML onvolumechange event.
 * Description: Script to be run each time the volume is changed which (includes setting the volume to mute).
 * @param value script
 */
fun List<Attribute>.onvolumechange(value: EventHandler) = add("onvolumechange", value)
