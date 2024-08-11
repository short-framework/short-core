package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML oninput event.
 * Description: Script to be run when an element gets user input.
 * @param value script
 */
fun Attribute.Companion.oninput(value: EventHandler) = add("oninput", value)

/**
 * Represents the HTML oninput event.
 * Description: Script to be run when an element gets user input.
 * @param value script
 */
fun List<Attribute>.oninput(value: EventHandler) = add("oninput", value)
