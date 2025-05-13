package lesson_2

import kotlin.math.pow

fun main() {
    val initialAmount = 70_000
    val interestRate = 16.7
    val years = 20
    val compoundInterest = initialAmount * (1 + interestRate / 100).pow(years)
    val formatResult = String.format("%.3f", compoundInterest)
    println("Размер вклада через $years лет: $formatResult")
}