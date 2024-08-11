package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onseeking event.
 * Description: Script to be run when the seeking attribute is set to true indicating that seeking is active.
 * @param value script
 */
fun Attribute.Companion.onseeking(value: EventHandler) = add("onseeking", value)

/**
 * Represents the HTML onseeking event.
 * Description: Script to be run when the seeking attribute is set to true indicating that seeking is active.
 * @param value script
 */
fun List<Attribute>.onseeking(value: EventHandler) = add("onseeking", value)
