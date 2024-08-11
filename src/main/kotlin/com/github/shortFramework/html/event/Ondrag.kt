package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ondrag event.
 * Description: Script to be run when an element is dragged.
 * @param value script
 */
fun Attribute.Companion.ondrag(value: EventHandler) = add("ondrag", value)

/**
 * Represents the HTML ondrag event.
 * Description: Script to be run when an element is dragged.
 * @param value script
 */
fun List<Attribute>.ondrag(value: EventHandler) = add("ondrag", value)
