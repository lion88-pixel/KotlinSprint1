package lesson_5

fun main() {
    val insufficientWeight = 18.5
    val weightIsNormal = 25
    val overWeight = 30
    println("Введите свой вес, в кг: ")
    val weight: Double = readln().toDouble()
    println("Введите свой рост, в см: ")
    val height: Double = readln().toDouble()
    val heightM: Double = height / 100
    val imt = weight / (heightM * heightM)
    val categoria = when {
        imt < insufficientWeight -> "Недостаточная масса тела"
        imt < weightIsNormal -> "Нормальная масса тела"
        imt < overWeight -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    val formatImt = String.format("%.2f", imt)
    println("Ваш ИМТ: $formatImt")
    println("Категория веса: $categoria")
}