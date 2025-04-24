package lesson_7

import kotlin.random.Random

fun main() {

    while (true) {
        val code = Random.nextInt(1000, 10000)
        println("Ваш код авторизации: $code")
        print("Введите код для авторизации: ")
        val enterNumber = readln().toInt()
        if (enterNumber == code) {
            println("Приветствую!")
            return
        } else {
            println("Неверно! Попробуйте еще раз")
        }
    }
}


