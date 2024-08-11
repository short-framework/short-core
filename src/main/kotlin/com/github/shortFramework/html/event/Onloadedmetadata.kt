package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onloadedmetadata event.
 * Description: Script to be run when meta data (like dimensions and duration) are loaded.
 * @param value script
 */
fun Attribute.Companion.onloadedmetadata(value: EventHandler) = add("onloadedmetadata", value)

/**
 * Represents the HTML onloadedmetadata event.
 * Description: Script to be run when meta data (like dimensions and duration) are loaded.
 * @param value script
 */
fun List<Attribute>.onloadedmetadata(value: EventHandler) = add("onloadedmetadata", value)
