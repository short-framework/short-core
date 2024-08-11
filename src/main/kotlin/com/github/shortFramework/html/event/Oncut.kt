package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML oncut event.
 * Description: Fires when the user cuts the content of an element.
 * @param value script
 */
fun Attribute.Companion.oncut(value: EventHandler) = add("oncut", value)

/**
 * Represents the HTML oncut event.
 * Description: Fires when the user cuts the content of an element.
 * @param value script
 */
fun List<Attribute>.oncut(value: EventHandler) = add("oncut", value)
