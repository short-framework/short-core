package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <ins> tag.
 * Description: Represents a range of text that has been added to a document. You can use the del element to similarly represent a range of text that has been deleted from the document.
 */
fun Tag.Ins(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("ins", attributes, scope, content))
}
