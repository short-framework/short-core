package pt.isel.SHORT.html.element

import pt.isel.SHORT.html.Attribute
import pt.isel.SHORT.html.Tag

/**
 * Represents the HTML <colgroup> tag.
 * Description: Defines a group of columns within a table.
 */
fun Tag.Colgroup(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("colgroup", attributes, content))
}
