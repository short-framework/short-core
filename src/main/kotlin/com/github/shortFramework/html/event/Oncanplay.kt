package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML oncanplay event.
 * Description: Script to be run when a file is ready to start playing (when it has buffered enough to begin).
 * @param value script
 */
fun Attribute.Companion.oncanplay(value: EventHandler) = add("oncanplay", value)

/**
 * Represents the HTML oncanplay event.
 * Description: Script to be run when a file is ready to start playing (when it has buffered enough to begin).
 * @param value script
 */
fun List<Attribute>.oncanplay(value: EventHandler) = add("oncanplay", value)
