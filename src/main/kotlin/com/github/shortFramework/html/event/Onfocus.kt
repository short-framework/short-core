package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onfocus event.
 * Description: Fires the moment when the element gets focus.
 * @param value script
 */
fun Attribute.Companion.onfocus(value: EventHandler) = add("onfocus", value)

/**
 * Represents the HTML onfocus event.
 * Description: Fires the moment when the element gets focus.
 * @param value script
 */
fun List<Attribute>.onfocus(value: EventHandler) = add("onfocus", value)
