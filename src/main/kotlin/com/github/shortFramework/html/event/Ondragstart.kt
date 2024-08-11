package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ondragstart event.
 * Description: Script to be run at the start of a drag operation.
 * @param value script
 */
fun Attribute.Companion.ondragstart(value: EventHandler) = add("ondragstart", value)

/**
 * Represents the HTML ondragstart event.
 * Description: Script to be run at the start of a drag operation.
 * @param value script
 */
fun List<Attribute>.ondragstart(value: EventHandler) = add("ondragstart", value)
