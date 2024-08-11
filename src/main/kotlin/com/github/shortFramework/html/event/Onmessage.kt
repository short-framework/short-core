package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onmessage event.
 * Description: Script to be run when the message is triggered.
 * @param value script
 */
fun Attribute.Companion.onmessage(value: EventHandler) = add("onmessage", value)

/**
 * Represents the HTML onmessage event.
 * Description: Script to be run when the message is triggered.
 * @param value script
 */
fun List<Attribute>.onmessage(value: EventHandler) = add("onmessage", value)
