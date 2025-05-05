package lesson_10

import kotlin.random.Random

fun rollDice(): Int {
    return Random.nextInt(1, 7)
}
fun main() {
    println("Игра: Бросаем кости!")
    val playerThrow = rollDice()
    println("Ход пользователя. Значение броска $playerThrow")
    val computerThrow = rollDice()
    println("Ход компьютера. Значение броска $computerThrow")

    if (playerThrow == computerThrow) {
        println("Победила дружба")
    } else if (playerThrow > computerThrow) {
        println("Победило человечество")
    } else {
        println("Победила машина")
    }
}