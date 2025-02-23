// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.window

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface PictureInPictureEventInit : EventInit {
    var pictureInPictureWindow: PictureInPictureWindow
}

open external class PictureInPictureEvent(
    override val type: EventType<PictureInPictureEvent>,
    init: PictureInPictureEventInit,
) : Event {
    val pictureInPictureWindow: PictureInPictureWindow

    companion object
}
