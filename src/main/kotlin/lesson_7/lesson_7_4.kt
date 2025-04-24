package lesson_7

fun main() {
    print("Введите количество секунд для таймера: ")
    val enterSecond = readln().toInt()
    println("Таймер запушен: ")

    for (i in enterSecond downTo 0 step 1) {
        Thread.sleep(1000)
        println("$i")
    }
    println("Время вышло")
}


