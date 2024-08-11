package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <dfn> tag.
 * Description: Used to indicate the term being defined within the context of a definition phrase or sentence. The ancestor p element, the dt/dd pairing, or the nearest section ancestor of the dfn element, is considered to be the definition of the term.
 */
fun Tag.Dfn(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("dfn", attributes, scope, content))
}
