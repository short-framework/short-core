package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML oncontextmenu event.
 * Description: Script to be run when a context menu is triggered.
 * @param value script
 */
fun Attribute.Companion.oncontextmenu(value: EventHandler) = add("oncontextmenu", value)

/**
 * Represents the HTML oncontextmenu event.
 * Description: Script to be run when a context menu is triggered.
 * @param value script
 */
fun List<Attribute>.oncontextmenu(value: EventHandler) = add("oncontextmenu", value)
