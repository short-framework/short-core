package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ondblclick event.
 * Description: Fires on a mouse double-click on the element.
 * @param value script
 */
fun Attribute.Companion.ondblclick(value: EventHandler) = add("ondblclick", value)

/**
 * Represents the HTML ondblclick event.
 * Description: Fires on a mouse double-click on the element.
 * @param value script
 */
fun List<Attribute>.ondblclick(value: EventHandler) = add("ondblclick", value)
