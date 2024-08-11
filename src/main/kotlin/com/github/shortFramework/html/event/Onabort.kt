package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onabort event.
 * Description: Script to be run on abort.
 * @param value script
 */
fun Attribute.Companion.onabort(value: EventHandler) = add("onabort", value)

/**
 * Represents the HTML onabort event.
 * Description: Script to be run on abort.
 * @param value script
 */
fun List<Attribute>.onabort(value: EventHandler) = add("onabort", value)
