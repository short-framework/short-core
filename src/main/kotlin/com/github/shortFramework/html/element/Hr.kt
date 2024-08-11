package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.VoidTag

/**
 * Represents the HTML <hr> tag.
 * Description: Represents a thematic break between paragraph-level elements: for example, a change of scene in a story, or a shift of topic within a section.
 */
fun Tag.Hr(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(VoidTag("hr", attributes, scope))
}
