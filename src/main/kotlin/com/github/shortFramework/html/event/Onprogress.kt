package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onprogress event.
 * Description: Script to be run when the browser is in the process of getting the media data.
 * @param value script
 */
fun Attribute.Companion.onprogress(value: EventHandler) = add("onprogress", value)

/**
 * Represents the HTML onprogress event.
 * Description: Script to be run when the browser is in the process of getting the media data.
 * @param value script
 */
fun List<Attribute>.onprogress(value: EventHandler) = add("onprogress", value)
