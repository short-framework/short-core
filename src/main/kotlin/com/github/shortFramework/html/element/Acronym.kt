package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <acronym> tag.
 * Description: Allows authors to clearly indicate a sequence of characters that compose an acronym or abbreviation for a word.
 */
fun Tag.Acronym(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("acronym", attributes, scope, content))
}
