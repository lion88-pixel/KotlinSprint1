package lesson_6

import java.util.Scanner
import kotlin.random.Random

fun main() {

    val scanner = Scanner(System.`in`)
    val secret = Random.nextInt(1, 9)
    val maxAttempts = 5
    var attempsLeft = maxAttempts

    println(
        "Угадай число, у Вас $maxAttempts попыток. В" +
                "ведите любое число от 1 до 9:"
    )
    while (attempsLeft > 0) {
        val guess = try {
            scanner.nextLine().toInt()
        } catch (e: NumberFormatException) {
            println(
                "Некорректный ввод. Введите целое число от 1 до 9."
            )
            continue
        }
        if (guess in 1..9) {
            if (guess == secret) {
                println("Это была великолепная игра!")
                scanner.close()
                return
            } else {
                attempsLeft--
                if (guess != secret) println("Неверно")
                println("Осталось $attempsLeft попыток")
            }
        } else {
            println("Введите любое число от 1 до 9:")
        }
    }
    println(
        "К сожалению попытки закончились. " +
                "Было загадано число $secret"
    )
    scanner.close()
}




