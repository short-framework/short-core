package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onblur event.
 * Description: Fires the moment that the element loses focus.
 * @param value script
 */
fun Attribute.Companion.onblur(value: EventHandler) = add("onblur", value)

/**
 * Represents the HTML onblur event.
 * Description: Fires the moment that the element loses focus.
 * @param value script
 */
fun List<Attribute>.onblur(value: EventHandler) = add("onblur", value)
