package com.github.shortFramework.html.event

import com.github.shortFramework.client.EventHandler
import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML ondragleave event.
 * Description: Script to be run when an element leaves a valid drop target.
 * @param value script
 */
fun Attribute.Companion.ondragleave(value: EventHandler) = add("ondragleave", value)

/**
 * Represents the HTML ondragleave event.
 * Description: Script to be run when an element leaves a valid drop target.
 * @param value script
 */
fun List<Attribute>.ondragleave(value: EventHandler) = add("ondragleave", value)
