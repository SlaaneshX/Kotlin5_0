fun main() {
//    val post: Post = Post(1, arrayOf(AudioAttachment(Audio(1, "name.mp3")), VideoAttachment(Video(1, "name"))))
}

data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Boolean = true,
    var comments: Comments? = null,
    var likes: LikesPost = LikesPost(),
    var copyright: Copyright = Copyright(),
    var reposts: Reposts = Reposts(),
    var views: Views = Views(),
    val postType: PostType = PostType.post,
    val postponedId: Int = 0,
    val isFavorite: Boolean = false,
    var donut: Donut = Donut(),
    var postSource: PostSource = PostSource(),
    var geo: Geo = Geo(),
    var markedAsADS: Boolean = false,
    var isPinned: Int = 0,
    var canEdit: Boolean = false,
    var canDelete: Boolean = false,
    var canPin: Boolean = false,
    var copyHistory: Array<Post>? = null,
    var signerId: Int = 0,
    val attachment: Array<Attachment> = emptyArray()
)

data class Place(
    val id: Int,
    val title: String,
    val latitude: Int,
    val longitude: Int,
    val created: Int,
    var icon: String,
    var checkins: Int,
    var updated: Int,
    val type: Int,
    val country: Int,
    val city: Int,
    val address: String
)

data class PostSource(
    val type: String = "",
    val platform: String = "",
    val data: String = "",
    val url: String = ""
)

data class Geo(
    val type: String = "",
    val coordinates: String = "",
    var place: Place? = null
)

data class Donut(
    val isDonut: Boolean = false,
    val paidDuration: Int = 0,
    val canPublishFreeCopy: Boolean = false,
    var editMode: DonutEditMode = DonutEditMode.all
)

enum class DonutEditMode { all, duration }

enum class PostType { post, copy, reply, postpone, suggest }

data class Views(
    val count: Int = 0
)

data class Comments(
    var count: Int = 0,
    var canPost: Boolean = true,
    var groupsCanPost: Boolean = true,
    var canClose: Boolean = true,
    var canOpen: Boolean = true
)

data class Copyright(
    val id: Int = 0,
    val link: String = "",
    val name: String = "",
    val type: String = ""
)

data class Reposts(
    val count: Int = 0,
    val user_reposted: Int = 0
)

data class LikesPost(
    var count: Int = 0,
    var userLikes: Boolean = true,
    var canLike: Boolean = true,
    var canPublish: Boolean = true
)
