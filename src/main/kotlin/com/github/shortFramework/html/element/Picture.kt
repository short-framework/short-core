package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <picture> tag.
 * Description: Contains zero or more source elements and one img element to offer alternative versions of an image for different display/device scenarios.
 */
fun Tag.Picture(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("picture", attributes, scope, content))
}
