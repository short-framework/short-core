package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <style> tag.
 * Description: Contains style information for a document or part of a document. It contains CSS, which is applied to the contents of the document containing this element.
 */
fun Tag.Style(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("style", attributes, scope, content))
}
