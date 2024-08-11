package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onsearch event.
 * Description: Fires when the user writes something in a search field (for input=search).
 * @param value script
 */
fun Attribute.Companion.onsearch(value: EventHandler) = add("onsearch", value)

/**
 * Represents the HTML onsearch event.
 * Description: Fires when the user writes something in a search field (for input=search).
 * @param value script
 */
fun List<Attribute>.onsearch(value: EventHandler) = add("onsearch", value)
