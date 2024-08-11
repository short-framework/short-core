package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onstorage event.
 * Description: Script to be run when a Web Storage area is updated.
 * @param value script
 */
fun Attribute.Companion.onstorage(value: EventHandler) = add("onstorage", value)

/**
 * Represents the HTML onstorage event.
 * Description: Script to be run when a Web Storage area is updated.
 * @param value script
 */
fun List<Attribute>.onstorage(value: EventHandler) = add("onstorage", value)
