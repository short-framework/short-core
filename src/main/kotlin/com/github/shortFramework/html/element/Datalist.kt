package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <datalist> tag.
 * Description: Contains a set of option elements that represent the permissible or recommended options available to choose from within other controls.
 */
fun Tag.Datalist(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("datalist", attributes, scope, content))
}
