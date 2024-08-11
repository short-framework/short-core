package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onkeyup event.
 * Description: Fires when a user releases a key.
 * @param value script
 */
fun Attribute.Companion.onkeyup(value: EventHandler) = add("onkeyup", value)

/**
 * Represents the HTML onkeyup event.
 * Description: Fires when a user releases a key.
 * @param value script
 */
fun List<Attribute>.onkeyup(value: EventHandler) = add("onkeyup", value)
