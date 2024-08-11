package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML oninvalid event.
 * Description: Script to be run when an element is invalid.
 * @param value script
 */
fun Attribute.Companion.oninvalid(value: EventHandler) = add("oninvalid", value)

/**
 * Represents the HTML oninvalid event.
 * Description: Script to be run when an element is invalid.
 * @param value script
 */
fun List<Attribute>.oninvalid(value: EventHandler) = add("oninvalid", value)
