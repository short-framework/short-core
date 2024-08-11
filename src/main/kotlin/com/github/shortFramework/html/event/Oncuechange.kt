package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML oncuechange event.
 * Description: Script to be run when the cue changes in a track element.
 * @param value script
 */
fun Attribute.Companion.oncuechange(value: EventHandler) = add("oncuechange", value)

/**
 * Represents the HTML oncuechange event.
 * Description: Script to be run when the cue changes in a track element.
 * @param value script
 */
fun List<Attribute>.oncuechange(value: EventHandler) = add("oncuechange", value)
