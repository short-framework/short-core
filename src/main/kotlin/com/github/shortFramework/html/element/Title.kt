package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <title> tag.
 * Description: Defines the document's title that is shown in a browser's title bar or a page's tab. It only contains text; tags within the element are ignored.
 */
fun Tag.Title(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("title", attributes, scope, content))
}
