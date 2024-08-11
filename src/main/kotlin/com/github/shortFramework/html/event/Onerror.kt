package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onerror event.
 * Description: Script to be run when an error occurs when the file is being loaded.
 * @param value script
 */
fun Attribute.Companion.onerror(value: EventHandler) = add("onerror", value)

/**
 * Represents the HTML onerror event.
 * Description: Script to be run when an error occurs when the file is being loaded.
 * @param value script
 */
fun List<Attribute>.onerror(value: EventHandler) = add("onerror", value)
