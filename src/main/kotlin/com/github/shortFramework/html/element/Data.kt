package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <data> tag.
 * Description: Links a given piece of content with a machine-readable translation. If the content is time- or date-related, thetime element must be used.
 */
fun Tag.Data(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("data", attributes, scope, content))
}
