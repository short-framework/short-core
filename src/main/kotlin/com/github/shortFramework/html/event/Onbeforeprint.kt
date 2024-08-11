package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onbeforeprint event.
 * Description: Script to be run before the document is printed.
 * @param value script
 */
fun Attribute.Companion.onbeforeprint(value: EventHandler) = add("onbeforeprint", value)

/**
 * Represents the HTML onbeforeprint event.
 * Description: Script to be run before the document is printed.
 * @param value script
 */
fun List<Attribute>.onbeforeprint(value: EventHandler) = add("onbeforeprint", value)
