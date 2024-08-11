package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onclick event.
 * Description: Fires on a mouse click on the element.
 * @param value script
 */
fun Attribute.Companion.onclick(value: EventHandler) = add("onclick", value)

/**
 * Represents the HTML onclick event.
 * Description: Fires on a mouse click on the element.
 * @param value script
 */
fun List<Attribute>.onclick(value: EventHandler) = add("onclick", value)
