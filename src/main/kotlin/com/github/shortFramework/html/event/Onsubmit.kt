package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onsubmit event.
 * Description: Fires when a form is submitted.
 * @param value script
 */
fun Attribute.Companion.onsubmit(value: EventHandler) = add("onsubmit", value)

/**
 * Represents the HTML onsubmit event.
 * Description: Fires when a form is submitted.
 * @param value script
 */
fun List<Attribute>.onsubmit(value: EventHandler) = add("onsubmit", value)
