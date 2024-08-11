package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onload event.
 * Description: Fires after the page is finished loading.
 * @param value script
 */
fun Attribute.Companion.onload(value: EventHandler) = add("onload", value)

/**
 * Represents the HTML onload event.
 * Description: Fires after the page is finished loading.
 * @param value script
 */
fun List<Attribute>.onload(value: EventHandler) = add("onload", value)
