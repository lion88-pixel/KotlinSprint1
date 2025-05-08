package lesson_7

fun main() {
    print("Введите число: ")
    val enterNumber = readln().toInt()
    println("Четные числа от 0 до $enterNumber: ")

    for (i in 0..enterNumber step 2) {
        println("$i")
    }
}


