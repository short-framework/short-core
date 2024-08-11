package com.github.shortFramework.html.attribute

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.attribute.add

/**
 * Represents the HTML formtarget attribute.
 * Description: If the button/input is a submit button (e.g. type="submit"), this attribute specifies the browsing context (for example, tab, window, or inline frame) in which to display the response that is received after submitting the form. If this attribute is specified, it overrides the target attribute of the button's form owner..
 * Supported elements: < button, input >
 */
fun Attribute.Companion.formtarget(value: String) = add("formtarget", value)

/**
 * Represents the HTML formtarget attribute.
 * Description: If the button/input is a submit button (e.g. type="submit"), this attribute specifies the browsing context (for example, tab, window, or inline frame) in which to display the response that is received after submitting the form. If this attribute is specified, it overrides the target attribute of the button's form owner..
 * Supported elements: < button, input >
 */
fun List<Attribute>.formtarget(value: String) = add("formtarget", value)
