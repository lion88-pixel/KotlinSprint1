package lesson_11

data class User(
    val userId: Int,
    val userName: String,
)

data class Message(
    val authorId: Int,
    val message: String,
)

class Forum {
    private val users = mutableListOf<User>()
    private val messages = mutableListOf<Message>()
    private var userIdCounter = 1

    fun createNewUser(userName: String): User {
        val user = User(userIdCounter++, userName)
        users.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, messageContent: String) {
        if (users.any { it.userId == authorId }) {
            val message = Message(authorId, messageContent)
            messages.add(message)
        } else {
            println("Пользователь с id $authorId не найден!")
        }
    }

    fun printThread() {
        for (message in messages) {
            val author = users.find { it.userId == message.authorId }
            println("${author?.userName ?: "Неизвестный автор"}: ${message.message}")
        }
    }
}

fun main() {

    val forum = Forum()
    val user1 = forum.createNewUser("Alice")
    val user2 = forum.createNewUser("Bob")

    forum.createNewMessage(user1.userId, "Привет, всем!")
    forum.createNewMessage(user2.userId, "Привет, Alice!")
    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "Все отлично, спасибо!")
    forum.printThread()
}