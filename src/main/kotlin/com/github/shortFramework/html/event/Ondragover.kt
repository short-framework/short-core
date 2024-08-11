package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ondragover event.
 * Description: Script to be run when an element is being dragged over a valid drop target.
 * @param value script
 */
fun Attribute.Companion.ondragover(value: EventHandler) = add("ondragover", value)

/**
 * Represents the HTML ondragover event.
 * Description: Script to be run when an element is being dragged over a valid drop target.
 * @param value script
 */
fun List<Attribute>.ondragover(value: EventHandler) = add("ondragover", value)
