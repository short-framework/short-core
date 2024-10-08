package com.github.shortFramework.html.base.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.EventAttribute
import com.github.shortFramework.html.base.attribute.toHtml

/**
 * Represents a void element in HTML
 * Implementation according to the [HTML Living Standard](https://html.spec.whatwg.org/multipage/syntax.html#void-elements)
 */
class VoidTag(
    internal val tag: String,
    internal val attributes: List<Attribute>,
    internal val scope: HtmlScope
) : Element {

    init {
        attributes.forEach { attribute ->
            if (attribute is EventAttribute) {
                attribute.register(scope)
            }
        }
    }

    override fun toHtml(): String {
        val attr = attributes.toHtml()
        return when {
            attr.isEmpty() -> "<$tag>"
            else -> "<$tag $attr>"
        }
    }

    override fun innerHtml(): String {
        // TODO: Decide if this should throw an exception or return an empty string
        throw UnsupportedOperationException("Void elements cannot have inner HTML")
    }
}
