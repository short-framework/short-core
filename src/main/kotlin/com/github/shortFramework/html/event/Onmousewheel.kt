package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onmousewheel event.
 * Description: Deprecated. Use the onwheel attribute instead.
 * @param value script
 */
@Deprecated("This event is deprecated.")
fun Attribute.Companion.onmousewheel(value: EventHandler) = add("onmousewheel", value)

/**
 * Represents the HTML onmousewheel event.
 * Description: Deprecated. Use the onwheel attribute instead.
 * @param value script
 */
@Deprecated("This event is deprecated.")
fun List<Attribute>.onmousewheel(value: EventHandler) = add("onmousewheel", value)
