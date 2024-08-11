package com.github.shortFramework.html.base.element

import com.github.shortFramework.component.Component
import com.github.shortFramework.html.attribute.id
import com.github.shortFramework.html.base.attribute.Attribute

typealias HtmlReceiver = Tag.(HtmlScope) -> Unit

fun prototype(
    tag: String,
    attributes: List<Attribute> = emptyList(),
    scope: HtmlScope,
    content: HtmlReceiver? = null
): Tag {
    val node = Tag(tag, attributes, scope, emptyList())
    if (content != null) {
        return node.loadHtmlContent(content)
    }
    return node
}

fun Tag.loadHtmlContent(content: HtmlReceiver): Tag {
    // This cast is safe but not checked by the compiler because the type is erased
    val contentFunction = content.javaClass
    val components = contentFunction.annotations.filterIsInstance<Component>()
    val isComponent = components.isNotEmpty()

    if (components.size > 1) {
        throw IllegalArgumentException("Component annotation can only be used once per function")
    }

    // Only run content if it is not a component
    return if (isComponent) {
        Tag("component", Attribute.id("component-${contentFunction.name}"), scope, emptyList())
    } else {
        this.apply {
            content(scope)
        }
    }
}
