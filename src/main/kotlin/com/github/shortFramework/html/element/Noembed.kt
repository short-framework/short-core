package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <noembed> tag.
 * Description: An obsolete, non-standard way to provide alternative, or "fallback", content for browsers that do not support the embed element or do not support the type of embedded content an author wishes to use. This element was deprecated in HTML 4.01 and above in favor of placing fallback content between the opening and closing tags of an object element.
 */
fun Tag.Noembed(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("noembed", attributes, scope, content))
}
