interface Attachment {
    val type: String
}

data class VideoAttachment(
    val video: Video
) : Attachment {
    override val type: String = "video"
}

data class AudioAttachment(
    val audio: Audio
) : Attachment {
    override val type: String = "audio"
}

data class DocAttachment(
    val audio: Doc
) : Attachment {
    override val type: String = "document"
}

data class AppAttachment(
    val audio: App
) : Attachment {
    override val type: String = "application"
}

data class GraffitiAttachment(
    val audio: Graffiti
) : Attachment {
    override val type: String = "graffiti"
}

data class Audio(
    val id: Int?,
    val name: String?
)

data class Video(
    val id: Int?,
    val name: String?
)

data class Doc(
    val id: Int?,
    val name: String?

)

data class Graffiti(
    val id: Int?,
    val name: String?
)

data class App(
    val id: Int?,
    val name: String?
)