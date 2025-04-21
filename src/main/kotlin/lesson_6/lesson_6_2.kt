package lesson_6

fun main() {
    println(
        "Введите количество секунд, " +
                "которое нужно засечь:"
    )
    val seconds = readln().toInt()
    var secondsNew = seconds

    while (secondsNew > 0) {
        secondsNew--
        Thread.sleep(1000)
    }
    println("Прошло ${seconds} секунд")
}

//do {
// println("${seconds--}")
// Thread.sleep(start = true)
//    }
// while (seconds > 0)
//{
//

//
//
//   break
// println("Прошло $seconds секунд")
//}
//
//
