package lesson_10

fun textLength(text: String): Boolean {
    return text.length >= 4
}

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()
    if (!textLength(login) || !textLength(password)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Регистрация завершеная, Ваш логин: $login")
    }
}