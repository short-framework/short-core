package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.VoidTag

/**
 * Represents the HTML <meta> tag.
 * Description: Represents metadata that cannot be represented by other HTML meta-related elements, like base, link, script, style and title.
 */
fun Tag.Meta(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(VoidTag("meta", attributes, scope))
}
