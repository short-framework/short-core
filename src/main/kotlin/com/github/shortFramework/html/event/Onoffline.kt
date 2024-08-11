package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onoffline event.
 * Description: Script to be run when the browser starts to work offline.
 * @param value script
 */
fun Attribute.Companion.onoffline(value: EventHandler) = add("onoffline", value)

/**
 * Represents the HTML onoffline event.
 * Description: Script to be run when the browser starts to work offline.
 * @param value script
 */
fun List<Attribute>.onoffline(value: EventHandler) = add("onoffline", value)
