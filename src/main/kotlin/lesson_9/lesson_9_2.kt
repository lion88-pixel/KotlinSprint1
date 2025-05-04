package lesson_9

fun main() {
    val recipe = mutableListOf("пармезан", "чеснок", "петрушка")
    println("В рецепте есть базовые ингредиенты: $recipe")
    println("Желание добавить ещё? (да/нет)")
    val request = readln()
    if (request.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newRecipe = readln()
        recipe.add(newRecipe)
        println("Теперь в рецепте есть следующие ингредиенты: $recipe")
    } else {
        println("Программа завершина")
    }
}