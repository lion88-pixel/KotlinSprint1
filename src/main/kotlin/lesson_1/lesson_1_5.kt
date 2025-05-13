package lesson_1

    const val translationPerSecond = 60

fun main() {
    val totalSecond = 6480
    val hours = totalSecond / (translationPerSecond * translationPerSecond)
    val minutes = (totalSecond % (translationPerSecond * translationPerSecond)) / translationPerSecond
    val seconds = totalSecond % translationPerSecond
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println("Время, проведенное в космосе: $formattedTime")
}
