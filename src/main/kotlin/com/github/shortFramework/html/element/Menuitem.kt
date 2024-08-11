package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <menuitem> tag.
 * Description: Represents a command that a user is able to invoke through a popup menu. This includes context menus, as well as menus that might be attached to a menu button.
 */
fun Tag.Menuitem(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("menuitem", attributes, scope, content))
}
