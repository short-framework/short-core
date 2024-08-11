package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onloadstart event.
 * Description: Script to be run just as the file begins to load before anything is actually loaded.
 * @param value script
 */
fun Attribute.Companion.onloadstart(value: EventHandler) = add("onloadstart", value)

/**
 * Represents the HTML onloadstart event.
 * Description: Script to be run just as the file begins to load before anything is actually loaded.
 * @param value script
 */
fun List<Attribute>.onloadstart(value: EventHandler) = add("onloadstart", value)
