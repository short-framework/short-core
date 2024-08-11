package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onkeypress event.
 * Description: Fires when a user presses a key.
 * @param value script
 */
fun Attribute.Companion.onkeypress(value: EventHandler) = add("onkeypress", value)

/**
 * Represents the HTML onkeypress event.
 * Description: Fires when a user presses a key.
 * @param value script
 */
fun List<Attribute>.onkeypress(value: EventHandler) = add("onkeypress", value)
