package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onunload event.
 * Description: Fires once a page has unloaded (or the browser window has been closed).
 * @param value script
 */
fun Attribute.Companion.onunload(value: EventHandler) = add("onunload", value)

/**
 * Represents the HTML onunload event.
 * Description: Fires once a page has unloaded (or the browser window has been closed).
 * @param value script
 */
fun List<Attribute>.onunload(value: EventHandler) = add("onunload", value)
