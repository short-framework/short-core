package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onstalled event.
 * Description: Script to be run when the browser is unable to fetch the media data for whatever reason.
 * @param value script
 */
fun Attribute.Companion.onstalled(value: EventHandler) = add("onstalled", value)

/**
 * Represents the HTML onstalled event.
 * Description: Script to be run when the browser is unable to fetch the media data for whatever reason.
 * @param value script
 */
fun List<Attribute>.onstalled(value: EventHandler) = add("onstalled", value)
