package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <summary> tag.
 * Description: Specifies a summary, caption, or legend for a details element's disclosure box. Clicking the summary element toggles the state of the parent details element open and closed.
 */
fun Tag.Summary(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("summary", attributes, scope, content))
}
