interface Attachment {
    val type: String
}

fun mmmmm() {
    val vType = VideoAttachment(Video(1, "Name")).type
}

class VideoAttachment(val video: Video) : Attachment {
    override val type: String = "video"
}

class AudioAttachment(val audio: Audio) : Attachment {
    override val type: String = "audio"
}

class DocAttachment(val audio: Doc) : Attachment {
    override val type: String = "document"
}

class AppAttachment(val audio: App) : Attachment {
    override val type: String = "application"
}

class GraffitiAttachment(val audio: Graffiti) : Attachment {
    override val type: String = "graffiti"
}

class Audio(
    val id: Int?,
    val name: String?
)

class Video(
    val id: Int?,
    val name: String?
)

class Doc(
    val id: Int?,
    val name: String?

)

class Graffiti(
    val id: Int?,
    val name: String?
)

class App(
    val id: Int?,
    val name: String?
)