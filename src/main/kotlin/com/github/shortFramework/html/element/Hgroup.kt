package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <hgroup> tag.
 * Description: Represents a heading grouped with any secondary content, such as subheadings, an alternative title, or a tagline.
 */
fun Tag.Hgroup(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("hgroup", attributes, scope, content))
}
