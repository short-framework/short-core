package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onpagehide event.
 * Description: Script to be run when a user navigates away from a page.
 * @param value script
 */
fun Attribute.Companion.onpagehide(value: EventHandler) = add("onpagehide", value)

/**
 * Represents the HTML onpagehide event.
 * Description: Script to be run when a user navigates away from a page.
 * @param value script
 */
fun List<Attribute>.onpagehide(value: EventHandler) = add("onpagehide", value)
