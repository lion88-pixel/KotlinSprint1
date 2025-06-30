package lesson_16

class User(val login: String, private val passwordHash: Int) {

    fun validatePassword(password: String): Boolean {
        return password.hashCode() == passwordHash
    }
}

fun main() {
    val user = User("MyLogin", "MySecretPassword".hashCode())
    print("Введите пароль: ")
    val enteredPassword = readlnOrNull() ?: ""
    val isPasswordValid = user.validatePassword(enteredPassword)
    println("Введенный пароль ${if (isPasswordValid) "верен" else "неверен"}.")
}