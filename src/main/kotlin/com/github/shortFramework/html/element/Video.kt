package com.github.shortFramework.html.element

import com.github.shortFramework.html.base.attribute.Attribute
import com.github.shortFramework.html.base.element.HtmlReceiver
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.base.element.prototype

/**
 * Represents the HTML <video> tag.
 * Description: Embeds a media player which supports video playback into the document. You can also use video for audio content, but the audio element may provide a more appropriate user experience.
 */
fun Tag.Video(attributes: List<Attribute> = emptyList(), content: HtmlReceiver? = null): Tag = apply {
    appendChild(prototype("video", attributes, scope, content))
}
