package lesson_7

fun main() {

    val passwordLenght = 6
    val password = buildString {
        for (i in 1..passwordLenght) {
            val numbers = ('0'..'9').random()
            val letters = ('a'..'z').random()
            append(
                if (i % 2 == 0) {
                    numbers
                } else {
                    letters
                }
            )
        }
    }
    println("Сгенерированный пароль: $password ")
}