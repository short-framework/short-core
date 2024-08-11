package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onbeforeunload event.
 * Description: Script to be run when the document is about to be unloaded.
 * @param value script
 */
fun Attribute.Companion.onbeforeunload(value: EventHandler) = add("onbeforeunload", value)

/**
 * Represents the HTML onbeforeunload event.
 * Description: Script to be run when the document is about to be unloaded.
 * @param value script
 */
fun List<Attribute>.onbeforeunload(value: EventHandler) = add("onbeforeunload", value)
