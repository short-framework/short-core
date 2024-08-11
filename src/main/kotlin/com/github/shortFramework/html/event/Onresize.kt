package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onresize event.
 * Description: Fires when the browser window is resized.
 * @param value script
 */
fun Attribute.Companion.onresize(value: EventHandler) = add("onresize", value)

/**
 * Represents the HTML onresize event.
 * Description: Fires when the browser window is resized.
 * @param value script
 */
fun List<Attribute>.onresize(value: EventHandler) = add("onresize", value)
