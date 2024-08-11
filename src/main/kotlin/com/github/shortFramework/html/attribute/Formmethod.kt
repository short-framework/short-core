package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML formmethod attribute.
 * Description: If the button/input is a submit button (e.g. type="submit"), this attribute sets the submission method to use during form submission (GET, POST, etc.). If this attribute is specified, it overrides the method attribute of the button's form owner..
 * Supported elements: < button, input >
 */
fun Attribute.Companion.formmethod(value: String) = add("formmethod", value)

/**
 * Represents the HTML formmethod attribute.
 * Description: If the button/input is a submit button (e.g. type="submit"), this attribute sets the submission method to use during form submission (GET, POST, etc.). If this attribute is specified, it overrides the method attribute of the button's form owner..
 * Supported elements: < button, input >
 */
fun List<Attribute>.formmethod(value: String) = add("formmethod", value)
