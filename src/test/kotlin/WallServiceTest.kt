import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {


    @Test
    fun add() {
        val ws = WallService()


        val testPost = ws.add(Post(0, 123))
        assertEquals(1, testPost.id)
    }

    @Test
    fun update_successful() {
        val ws = WallService()

        ws.add(Post(ownerId = 123))
        ws.add(Post(ownerId = 124))
        ws.add(Post(ownerId = 125))

        var update = ws.add(Post(ownerId = 126))
        update = update.copy(text = "Some post text")
        val result = ws.update(update)

        assertTrue(result)
    }

    @Test
    fun update_failed() {
        val ws = WallService()
        ws.add(Post(ownerId = 123))
        ws.add(Post(ownerId = 124))
        ws.add(Post(ownerId = 125))

        var update = ws.add(Post(ownerId = 126))
        update = update.copy(id = 5678, text = "Some post text")
        val result = ws.update(update)

        assertFalse(result)
    }
}