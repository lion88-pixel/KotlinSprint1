package lesson_6

fun main() {
    println(
        "Введите количество секунд, " +
                "которое нужно засечь:"
    )
    val seconds = readln().toInt()
    Thread.sleep(seconds * 1000L)
    println("Прошло ${seconds} секунд")
}
