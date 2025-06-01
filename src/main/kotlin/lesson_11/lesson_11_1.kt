package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val userOne = User(1, "user_one", "password1", "user1@mail.ru")
    val userTwo = User(2, "user_two", "password2", "user2@mail.ru")
    println("user_оne: ${userOne.id}, ${userOne.login}, ${userOne.password}, ${userOne.email}")
    println("user_two: ${userTwo.id}, ${userTwo.login}, ${userTwo.password}, ${userTwo.email}")
}