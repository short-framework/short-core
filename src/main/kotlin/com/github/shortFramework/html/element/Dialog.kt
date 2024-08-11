package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <dialog> tag.
 * Description: Represents a dialog box or other interactive component, such as a dismissible alert, inspector, or subwindow.
 */
fun Tag.Dialog(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("dialog", attributes, scope, content))
}
