package lesson_10

fun generatorPassword(length: Int): String =
    buildString {
        for (i in 0 until length) {
            val numbersUsed = (0..9).random()
            val symbolsUsed = "!\"#$%&'()*+,-./".random()
            append(
                if (i % 2 == 0) {
                    numbersUsed
                } else {
                    symbolsUsed
                }
            )
        }
    }

fun main() {
    println("Введите требуемую длину пароля: ")
    val passwordLength = readln().toInt()
    val password = generatorPassword(passwordLength)
    println("Результат: $password")
}