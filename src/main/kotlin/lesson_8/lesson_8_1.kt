package lesson_8

fun main() {
    val viewsByDay = intArrayOf(200, 120,
        321, 250, 190, 240, 340)
    println(
        "количество просмотров за неделю: " +
                "${viewsByDay[0] + viewsByDay[1] + viewsByDay[2] + viewsByDay[3] 
                        + viewsByDay[4] + viewsByDay[5] + viewsByDay[6]}"
    )
}
