package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onmouseup event.
 * Description: Fires when a mouse button is released over an element.
 * @param value script
 */
fun Attribute.Companion.onmouseup(value: EventHandler) = add("onmouseup", value)

/**
 * Represents the HTML onmouseup event.
 * Description: Fires when a mouse button is released over an element.
 * @param value script
 */
fun List<Attribute>.onmouseup(value: EventHandler) = add("onmouseup", value)
