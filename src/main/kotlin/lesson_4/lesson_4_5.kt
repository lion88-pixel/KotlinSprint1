package lesson_4

fun main() {
    println("наличие повреждеий корпуса (true/false): ")
    val caseDamage = readln().toBoolean()
    println("текущий состав экипажа: ")
    val crewComposition = readln().toInt()
    println("количество ящиков с провизией на борту: ")
    val boxesOfProvisions = readln().toInt()
    println("благоприятность метеоусловий (true/false): ")
    val weatherConditions = readln().toBoolean()
    val canSail =
        (!caseDamage && crewComposition in 55..70 && boxesOfProvisions > 50 && (weatherConditions || !weatherConditions)) || (crewComposition == 70 && weatherConditions && boxesOfProvisions >= 50)

    if (canSail) {
        println("корабль может отправляться в плавание")
    } else {
        println("корабль не может отправляться в плавание")
    }
}