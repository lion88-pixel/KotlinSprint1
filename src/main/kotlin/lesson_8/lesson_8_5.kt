package lesson_8

fun main() {
    println("Введите количество ингредиентов: ")
    val quantityOfIngredients = readln().toInt()
    println("Введите ингредиенты по одному: ")
    val ingredients = Array(quantityOfIngredients) {""}
    for (i in 0 until quantityOfIngredients) {
        print("Ингредиент ${i + 1}: ")
        ingredients[i] = readln()
    }
    println("Список ингредиентов: ${ingredients.joinToString(", ")}")
}