package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <rb> tag.
 * Description: Used to delimit the base text component of a ruby annotation, i.e. the text that is being annotated. One rb element should wrap each separate atomic segment of the base text.
 */
fun Tag.Rb(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("rb", attributes, scope, content))
}
