package lesson_8

fun main() {
    println(
        "Рецепт приготовления пасты карбонары со сливками и беконом"
    )
    println("Какой ингредиент Вы хотите в рецепте найти?")
    val recipe = arrayOf("пармезан", "чеснок", "петрушка", "соль")
    val request = readln()
    if (request in recipe) {
        println("Ингредиент $request в рецепте есть")
    } else {
        println("Ингредиента в рецепте нет")
    }
}