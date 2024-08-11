package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onmousemove event.
 * Description: Fires when the mouse pointer is moving while it is over an element.
 * @param value script
 */
fun Attribute.Companion.onmousemove(value: EventHandler) = add("onmousemove", value)

/**
 * Represents the HTML onmousemove event.
 * Description: Fires when the mouse pointer is moving while it is over an element.
 * @param value script
 */
fun List<Attribute>.onmousemove(value: EventHandler) = add("onmousemove", value)
