package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onselect event.
 * Description: Fires after some text has been selected in an element.
 * @param value script
 */
fun Attribute.Companion.onselect(value: EventHandler) = add("onselect", value)

/**
 * Represents the HTML onselect event.
 * Description: Fires after some text has been selected in an element.
 * @param value script
 */
fun List<Attribute>.onselect(value: EventHandler) = add("onselect", value)
