package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onreset event.
 * Description: Fires when the Reset button in a form is clicked.
 * @param value script
 */
fun Attribute.Companion.onreset(value: EventHandler) = add("onreset", value)

/**
 * Represents the HTML onreset event.
 * Description: Fires when the Reset button in a form is clicked.
 * @param value script
 */
fun List<Attribute>.onreset(value: EventHandler) = add("onreset", value)
