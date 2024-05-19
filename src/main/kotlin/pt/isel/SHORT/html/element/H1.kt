package pt.isel.SHORT.html.element

import pt.isel.SHORT.html.base.attribute.Attribute
import pt.isel.SHORT.html.base.element.HtmlReceiver
import pt.isel.SHORT.html.base.element.Tag
import pt.isel.SHORT.html.base.element.prototype

/**
 * Represents the HTML <h1> tag.
 * Description: Represent six levels of section headings. h1 is the highest section level and h6 is the lowest.
 */
fun Tag.H1(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("h1", attributes, scope, content))
}
