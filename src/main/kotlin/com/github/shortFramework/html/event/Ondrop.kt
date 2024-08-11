package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ondrop event.
 * Description: Script to be run when dragged element is being dropped.
 * @param value script
 */
fun Attribute.Companion.ondrop(value: EventHandler) = add("ondrop", value)

/**
 * Represents the HTML ondrop event.
 * Description: Script to be run when dragged element is being dropped.
 * @param value script
 */
fun List<Attribute>.ondrop(value: EventHandler) = add("ondrop", value)
