package lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()
    println("Введите 5 игредиетов:")
    repeat(5) {
        print("Ингредиент ${it + 1}: ")
        ingredients.add(readln().lowercase())
    }
    val sorted = ingredients.toSortedSet()
    val first = sorted.firstOrNull()?.replaceFirstChar(Char::titlecaseChar)
    val rest = sorted.drop(1).joinToString(", ")
    println(listOf(first, rest))
}