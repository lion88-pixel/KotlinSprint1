package lesson_11

fun main() {
    val userOne = User(1, "user_one", "password1", "user1@mail.ru")
    val userTwo = User(2, "user_two", "password2", "user2@mail.ru")
    println("user one: ${userOne.id}, ${userOne.login}, ${userOne.password}, ${userOne.email}")
    println("user two: ${userTwo.id}, ${userTwo.login}, ${userTwo.password}, ${userTwo.email}")
}