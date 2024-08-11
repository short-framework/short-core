package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ondragend event.
 * Description: Script to be run at the end of a drag operation.
 * @param value script
 */
fun Attribute.Companion.ondragend(value: EventHandler) = add("ondragend", value)

/**
 * Represents the HTML ondragend event.
 * Description: Script to be run at the end of a drag operation.
 * @param value script
 */
fun List<Attribute>.ondragend(value: EventHandler) = add("ondragend", value)
