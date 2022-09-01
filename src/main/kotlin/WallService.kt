class WallService {
    var posts: Array<Post> = emptyArray()
    var comments: Array<Comment> = emptyArray()

    private var idCounter: Int = 0

    private fun returnNextId(): Int {
        return ++idCounter
    }

    fun add(post: Post): Post {
        val newPost: Post = post.copy(id = returnNextId())
        posts += newPost

        return posts.last()
    }

    fun update(post: Post): Boolean {
        val id = post.id
        for ((index, currPost) in posts.withIndex()) {
            if (currPost.id == id) {
                val currDate = currPost.date
                val currOwnerId = currPost.ownerId
                posts[index] = post.copy(date = currDate, ownerId = currOwnerId)

                return true
            }
        }

        return false
    }


    fun createComment(comment: Comment) {
        val postId = comment.postId
        var foundPost = false

        for ((index, currPost) in posts.withIndex()) {
            if (postId == currPost.id) {
                if (posts[index].comments == null) {
                    posts[index].comments = Comments()
                }

                comments += comment
                posts[index].comments?.count?.plus(1)
                foundPost = true
                break
            }
        }

        if (!foundPost) {
            throw PostNotFoundException("Пост с идентификатором $postId не найден.")
        }
    }

    internal fun clearData() {
        posts = emptyArray()
        idCounter = 0
        comments = emptyArray()
        idCounter = 0
    }
}