package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <dt> tag.
 * Description: Specifies a term in a description or definition list, and as such must be used inside a dl element. It is usually followed by a dd element; however, multiple dt elements in a row indicate several terms that are all defined by the immediate next dd element.
 */
fun Tag.Dt(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("dt", attributes, scope, content))
}
