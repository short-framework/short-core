package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML onpageshow event.
 * Description: Script to be run when a user navigates to a page.
 * @param value script
 */
fun Attribute.Companion.onpageshow(value: EventHandler) = add("onpageshow", value)

/**
 * Represents the HTML onpageshow event.
 * Description: Script to be run when a user navigates to a page.
 * @param value script
 */
fun List<Attribute>.onpageshow(value: EventHandler) = add("onpageshow", value)
