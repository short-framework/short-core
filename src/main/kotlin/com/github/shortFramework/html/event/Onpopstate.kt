package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onpopstate event.
 * Description: Script to be run when the window's history changes.
 * @param value script
 */
fun Attribute.Companion.onpopstate(value: EventHandler) = add("onpopstate", value)

/**
 * Represents the HTML onpopstate event.
 * Description: Script to be run when the window's history changes.
 * @param value script
 */
fun List<Attribute>.onpopstate(value: EventHandler) = add("onpopstate", value)
