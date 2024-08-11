package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <output> tag.
 * Description: Container element into which a site or app can inject the results of a calculation or the outcome of a user action.
 */
fun Tag.Output(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("output", attributes, scope, content))
}
