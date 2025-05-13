package lesson_5

import  kotlin.random.Random

const val ZERO = 0
const val FORTY_TWO = 42
fun generator(): List<Int> {
    return (ZERO..FORTY_TWO).shuffled(Random.Default).take(3)
}

fun main() {
    println()
    val enterTheFirstNumber = readln().toInt()
    val enterTheSecondNumber = readln().toInt()
    val enterTheThireNumber = readln().toInt()
    val result = generator()
    val set1 = setOf(enterTheThireNumber, enterTheSecondNumber, enterTheFirstNumber)
    val intersection = result.intersect(set1.toSet()).size
    when (intersection) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Отлично! Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число. Получите утешительный приз!")
        else -> println("К сожалению Вы не угадали ни одного числа")
    }
    println("Выигрышные числа: $result")
}