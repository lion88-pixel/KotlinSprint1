package lesson_16

import kotlin.random.Random

class Dice {
    private val randomNumber = Random.nextInt(1, 7)

    fun rollTheDice() {
        println("На кубике выпало число: $randomNumber")
    }
}

fun main() {
    val dice = Dice()
    dice.rollTheDice()
}