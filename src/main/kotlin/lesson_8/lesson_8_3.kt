package lesson_8

fun main() {
    println(
        "Рецепт приготовления пасты карбонары " +
                "со сливками и беконом"
    )
    println("Какой ингредиент Вы хотите в рецепте найти?")
    val viewsByDay = arrayOf(
        "спаггети", "бекон", "желтки", "пармезан", "чеснок",
        "петрушка", "соль"
    )
    val request = readln().lowercase()
    val ingredient = viewsByDay.any { it.lowercase() == request }

    if (ingredient) {
        println("Ингредиент $request рецепте есть ")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}