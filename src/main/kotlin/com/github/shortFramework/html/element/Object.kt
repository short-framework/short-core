package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <object> tag.
 * Description: Represents an external resource, which can be treated as an image, a nested browsing context, or a resource to be handled by a plugin.
 */
fun Tag.Object(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("object", attributes, scope, content))
}
