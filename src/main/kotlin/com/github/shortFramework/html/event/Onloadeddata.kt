package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onloadeddata event.
 * Description: Script to be run when media data is loaded.
 * @param value script
 */
fun Attribute.Companion.onloadeddata(value: EventHandler) = add("onloadeddata", value)

/**
 * Represents the HTML onloadeddata event.
 * Description: Script to be run when media data is loaded.
 * @param value script
 */
fun List<Attribute>.onloadeddata(value: EventHandler) = add("onloadeddata", value)
