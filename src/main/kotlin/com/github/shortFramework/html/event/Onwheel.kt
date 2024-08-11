package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onwheel event.
 * Description: Fires when the mouse wheel rolls up or down over an element.
 * @param value script
 */
fun Attribute.Companion.onwheel(value: EventHandler) = add("onwheel", value)

/**
 * Represents the HTML onwheel event.
 * Description: Fires when the mouse wheel rolls up or down over an element.
 * @param value script
 */
fun List<Attribute>.onwheel(value: EventHandler) = add("onwheel", value)
