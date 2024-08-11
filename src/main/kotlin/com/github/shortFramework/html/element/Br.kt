package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.VoidTag

/**
 * Represents the HTML <br> tag.
 * Description: Produces a line break in text (carriage-return). It is useful for writing a poem or an address, where the division of lines is significant.
 */
fun Tag.Br(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(VoidTag("br", attributes, scope))
}
