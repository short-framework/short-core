package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onchange event.
 * Description: Fires the moment when the value of the element is changed.
 * @param value script
 */
fun Attribute.Companion.onchange(value: EventHandler) = add("onchange", value)

/**
 * Represents the HTML onchange event.
 * Description: Fires the moment when the value of the element is changed.
 * @param value script
 */
fun List<Attribute>.onchange(value: EventHandler) = add("onchange", value)
