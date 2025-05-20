package lesson_4

const val MINIMUM_CREW = 55
const val MAX_CREW = 70
const val PROVISION_NORM = 50

fun main() {
    println("наличие повреждеий корпуса (true/false): ")
    val isCaseDamage = readln().toBoolean()
    println("текущий состав экипажа: ")
    val crewComposition = readln().toInt()
    println("количество ящиков с провизией на борту: ")
    val boxesOfProvisions = readln().toInt()
    println("благоприятность метеоусловий (true/false): ")
    val isWeatherConditions = readln().toBoolean()
    val isCanSail =
        (!isCaseDamage && crewComposition in MINIMUM_CREW..MAX_CREW && boxesOfProvisions > PROVISION_NORM ||
                (crewComposition == MAX_CREW && isWeatherConditions && boxesOfProvisions >= PROVISION_NORM))
    if (isCanSail) {
        println("корабль может отправляться в плавание")
    } else {
        println("корабль не может отправляться в плавание")
    }
}