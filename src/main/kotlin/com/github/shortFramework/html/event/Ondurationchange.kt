package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ondurationchange event.
 * Description: Script to be run when the length of the media changes.
 * @param value script
 */
fun Attribute.Companion.ondurationchange(value: EventHandler) = add("ondurationchange", value)

/**
 * Represents the HTML ondurationchange event.
 * Description: Script to be run when the length of the media changes.
 * @param value script
 */
fun List<Attribute>.ondurationchange(value: EventHandler) = add("ondurationchange", value)
