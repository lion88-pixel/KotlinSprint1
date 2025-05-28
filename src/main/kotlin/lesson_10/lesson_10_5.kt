package lesson_10

const val CORRECT_LOGIN = "admin"
const val CORRECT_PASSWORD = "password"

fun authenticate(login: String, password: String): String? =
    if (login == CORRECT_LOGIN && password == CORRECT_PASSWORD) generateToken() else null

fun generateToken(): String {
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..32).map { chars.random() }.joinToString("")
}

fun getCart(token: String): List<String>? =
    if (token.isNotEmpty()) listOf("Товар 1", "Товар 2", "Товар 3") else null

fun main() {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()
    val token = authenticate(login, password)

    if (token != null) {
        val cart = getCart(token) ?: return println("Ошибка получения корзины")
        println("Содержимое корзины:")
        cart.forEach { println(it) }
    } else {
        println("Неудачная авторизация.")
    }
}