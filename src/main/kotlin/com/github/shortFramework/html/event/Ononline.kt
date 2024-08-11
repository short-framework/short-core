package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ononline event.
 * Description: Script to be run when the browser starts to work online.
 * @param value script
 */
fun Attribute.Companion.ononline(value: EventHandler) = add("ononline", value)

/**
 * Represents the HTML ononline event.
 * Description: Script to be run when the browser starts to work online.
 * @param value script
 */
fun List<Attribute>.ononline(value: EventHandler) = add("ononline", value)
