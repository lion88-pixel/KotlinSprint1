package lesson_6

fun main() {
    println(
        "Введите количество секунд, " +
                "которое нужно засечь:"
    )
    val seconds = readln().toInt()
    var secondsNew = seconds - 1
    while (secondsNew > 0) {
        println("Осталось секунд: ${secondsNew--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}
