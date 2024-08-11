package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ondragenter event.
 * Description: Script to be run when an element has been dragged to a valid drop target.
 * @param value script
 */
fun Attribute.Companion.ondragenter(value: EventHandler) = add("ondragenter", value)

/**
 * Represents the HTML ondragenter event.
 * Description: Script to be run when an element has been dragged to a valid drop target.
 * @param value script
 */
fun List<Attribute>.ondragenter(value: EventHandler) = add("ondragenter", value)
