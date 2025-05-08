package lesson_9

fun main() {
    val recipe = listOf("пармезан", "чеснок", "петрушка", "соль", "морковь", "лук")
    println("В рецепте енсть следующие ингредиенты: ")
    recipe.forEach() { listOfIngredients ->
        println(listOfIngredients)
    }
}