package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML oncanplaythrough event.
 * Description: Script to be run when a file can be played all the way to the end without pausing for buffering.
 * @param value script
 */
fun Attribute.Companion.oncanplaythrough(value: EventHandler) = add("oncanplaythrough", value)

/**
 * Represents the HTML oncanplaythrough event.
 * Description: Script to be run when a file can be played all the way to the end without pausing for buffering.
 * @param value script
 */
fun List<Attribute>.oncanplaythrough(value: EventHandler) = add("oncanplaythrough", value)
