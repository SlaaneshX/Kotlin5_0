fun main() {

}

//Data класс Post (и другие классы, которые могут быть вложены в Post).
data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
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

object WallService {
//Объект WallService, который внутри себя хранит посты в массиве.
}