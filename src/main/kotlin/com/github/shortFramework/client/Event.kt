package com.github.shortFramework.client

import com.github.shortFramework.html.base.element.Tag

class Event(tag: Tag) {

    val target = Target(tag)
    class Target(tag: Tag) {
        val value = tag.Var("")
    }

    fun preventDefault() {
        TODO()
    }
}
