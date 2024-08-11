package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onmouseout event.
 * Description: Fires when the mouse pointer moves out of an element.
 * @param value script
 */
fun Attribute.Companion.onmouseout(value: EventHandler) = add("onmouseout", value)

/**
 * Represents the HTML onmouseout event.
 * Description: Fires when the mouse pointer moves out of an element.
 * @param value script
 */
fun List<Attribute>.onmouseout(value: EventHandler) = add("onmouseout", value)
