package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ontoggle event.
 * Description: Fires when the user opens or closes the details element.
 * @param value script
 */
fun Attribute.Companion.ontoggle(value: EventHandler) = add("ontoggle", value)

/**
 * Represents the HTML ontoggle event.
 * Description: Fires when the user opens or closes the details element.
 * @param value script
 */
fun List<Attribute>.ontoggle(value: EventHandler) = add("ontoggle", value)
