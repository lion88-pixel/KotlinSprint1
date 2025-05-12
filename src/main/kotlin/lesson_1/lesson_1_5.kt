package lesson_1

fun main() {
    val totalSecond = 6480
    val hours = totalSecond / 3600
    val minutes = (totalSecond % 3600) / 60
    val seconds = totalSecond % 60
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println("Время, проведенное в космосе: $formattedTime")
}
