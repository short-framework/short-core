package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onpaste event.
 * Description: Fires when the user pastes some content in an element.
 * @param value script
 */
fun Attribute.Companion.onpaste(value: EventHandler) = add("onpaste", value)

/**
 * Represents the HTML onpaste event.
 * Description: Fires when the user pastes some content in an element.
 * @param value script
 */
fun List<Attribute>.onpaste(value: EventHandler) = add("onpaste", value)
