class WallService {
    var posts: Array<Post> = emptyArray<Post>()
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
//        Он должен находить среди всех постов запись с тем же id, что и у post и обновлять все свойства, кроме id владельца и даты создания.
                val currDate = currPost.date
                val currOwnerId = currPost.ownerId
                posts[index] = post.copy(date = currDate, ownerId = currOwnerId)

                return true
            }
        }

        return false
    }

}