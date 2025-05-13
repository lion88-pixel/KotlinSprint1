package lesson_10

fun generatePassword(length: Int): String =
    buildString {
        for (i in 0 until length) {
            val numbersUsed = (0..9).random()
            val symbolsUsed = (33..47).toList().map { it.toChar() }.filter { it in '!'..'/' }
            append(
                if (i % 2 == 0) {
                    numbersUsed
                } else {
                    symbolsUsed.random()
                }
            )
        }
    }

fun main() {
    println("Введите требуемую длину пароля: ")
    val passwordLength = readln().toInt()
    val password = generatePassword(passwordLength)
    println("Результат: $password")
}