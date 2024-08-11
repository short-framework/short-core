package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onmouseover event.
 * Description: Fires when the mouse pointer moves over an element.
 * @param value script
 */
fun Attribute.Companion.onmouseover(value: EventHandler) = add("onmouseover", value)

/**
 * Represents the HTML onmouseover event.
 * Description: Fires when the mouse pointer moves over an element.
 * @param value script
 */
fun List<Attribute>.onmouseover(value: EventHandler) = add("onmouseover", value)
