package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML oncopy event.
 * Description: Fires when the user copies the content of an element.
 * @param value script
 */
fun Attribute.Companion.oncopy(value: EventHandler) = add("oncopy", value)

/**
 * Represents the HTML oncopy event.
 * Description: Fires when the user copies the content of an element.
 * @param value script
 */
fun List<Attribute>.oncopy(value: EventHandler) = add("oncopy", value)
