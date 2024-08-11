package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onmousedown event.
 * Description: Fires when a mouse button is pressed down on an element.
 * @param value script
 */
fun Attribute.Companion.onmousedown(value: EventHandler) = add("onmousedown", value)

/**
 * Represents the HTML onmousedown event.
 * Description: Fires when a mouse button is pressed down on an element.
 * @param value script
 */
fun List<Attribute>.onmousedown(value: EventHandler) = add("onmousedown", value)
