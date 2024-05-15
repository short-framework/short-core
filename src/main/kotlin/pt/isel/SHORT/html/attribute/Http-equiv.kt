package pt.isel.SHORT.html.attribute

import pt.isel.SHORT.html.Attribute
import pt.isel.SHORT.html.add

/**
 * Represents the HTML http-equiv attribute.
 * Description: Defines a pragma directive.
 * Supported elements: <meta>
 */
fun Attribute.Companion.http-equiv(value: String) = add("http-equiv", value)
fun List<Attribute>.http-equiv(value: String) = add("http-equiv", value)