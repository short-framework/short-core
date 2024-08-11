package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onscroll event.
 * Description: Script to be run when an element's scrollbar is being scrolled.
 * @param value script
 */
fun Attribute.Companion.onscroll(value: EventHandler) = add("onscroll", value)

/**
 * Represents the HTML onscroll event.
 * Description: Script to be run when an element's scrollbar is being scrolled.
 * @param value script
 */
fun List<Attribute>.onscroll(value: EventHandler) = add("onscroll", value)
