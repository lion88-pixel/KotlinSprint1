package lesson_6

fun main() {

    val attemps = 3
    for (i in 1..attemps) {
        val num1 = (1..9).random()
        val num2 = (1..9).random()
        val correctAnswer = num1 + num2
        print("Попытка $i: решите пример: $num1 + $num2 = ")
        val userAnswer = readln().toInt()
        if (userAnswer == correctAnswer) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно. Попробуйте ещё раз.")
        }
    }
    println("Доступ запрещен")
}