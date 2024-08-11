package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onafterprint event.
 * Description: Script to be run after the document is printed.
 * @param value script
 */
fun Attribute.Companion.onafterprint(value: EventHandler) = add("onafterprint", value)

/**
 * Represents the HTML onafterprint event.
 * Description: Script to be run after the document is printed.
 * @param value script
 */
fun List<Attribute>.onafterprint(value: EventHandler) = add("onafterprint", value)
