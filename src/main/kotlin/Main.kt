fun main() {

}

data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = true,
    var comments: Comments = Comments(),
    var likes: Likes = Likes()
)

data class Comments(
    var count: Int = 0,
    var canPost: Boolean = true,
    var groupsCanPost: Boolean = true,
    var canClose: Boolean = true,
    var canOpen: Boolean = true
)

data class Likes(
    var count: Int = 0,
    var userLikes: Boolean = true,
    var canLike: Boolean = true,
    var canPublish: Boolean = true
)