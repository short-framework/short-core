package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onended event.
 * Description: Script to be run when the media has reach the end (a useful event for messages like thanks for listening).
 * @param value script
 */
fun Attribute.Companion.onended(value: EventHandler) = add("onended", value)

/**
 * Represents the HTML onended event.
 * Description: Script to be run when the media has reach the end (a useful event for messages like thanks for listening).
 * @param value script
 */
fun List<Attribute>.onended(value: EventHandler) = add("onended", value)
