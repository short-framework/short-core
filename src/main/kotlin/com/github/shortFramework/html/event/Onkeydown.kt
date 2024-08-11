package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onkeydown event.
 * Description: Fires when a user is pressing a key.
 * @param value script
 */
fun Attribute.Companion.onkeydown(value: EventHandler) = add("onkeydown", value)

/**
 * Represents the HTML onkeydown event.
 * Description: Fires when a user is pressing a key.
 * @param value script
 */
fun List<Attribute>.onkeydown(value: EventHandler) = add("onkeydown", value)
