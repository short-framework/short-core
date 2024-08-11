package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <strong> tag.
 * Description: Indicates that its contents have strong importance, seriousness, or urgency. Browsers typically render the contents in bold type.
 */
fun Tag.Strong(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("strong", attributes, scope, content))
}
