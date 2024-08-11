package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <noscript> tag.
 * Description: Defines a section of HTML to be inserted if a script type on the page is unsupported or if scripting is currently turned off in the browser.
 */
fun Tag.Noscript(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("noscript", attributes, scope, content))
}
