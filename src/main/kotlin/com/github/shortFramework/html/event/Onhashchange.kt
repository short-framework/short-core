package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onhashchange event.
 * Description: Script to be run when there has been changes to the anchor part of the a URL.
 * @param value script
 */
fun Attribute.Companion.onhashchange(value: EventHandler) = add("onhashchange", value)

/**
 * Represents the HTML onhashchange event.
 * Description: Script to be run when there has been changes to the anchor part of the a URL.
 * @param value script
 */
fun List<Attribute>.onhashchange(value: EventHandler) = add("onhashchange", value)
