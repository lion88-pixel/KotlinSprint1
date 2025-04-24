package lesson_7

fun main() {
    val passwordLenght = 6
    val password = buildString {
        for (i in 1..passwordLenght) {
            append(
                if (i % 2 == 0) {
                    ('0'..'9').random()
                } else {
                    ('a'..'z').random()
                }
            )
        }
    }
    println("Сгенерированный пароль: $password ")
}




