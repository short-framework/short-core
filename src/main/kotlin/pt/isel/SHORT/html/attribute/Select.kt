package pt.isel.SHORT.html.element

import pt.isel.SHORT.html.Attribute
import pt.isel.SHORT.html.Tag

/**
 * Represents the HTML <select> tag.
 * Description: Represents a control that provides a menu of options.
 */
fun Tag.Select(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("select", attributes, content))
}
