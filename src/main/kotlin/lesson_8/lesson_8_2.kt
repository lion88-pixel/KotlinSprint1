package lesson_8

fun main() {
    println(
        "Рецепт приготовления пасты карбонары со сливками и беконом"
    )
    println("Какой ингредиент Вы хотите в рецепте найти?")
    val recipe = arrayOf("пармезан", "чеснок", "петрушка", "соль")
    val request = readln()
    for (i in recipe) {
        if (i == request) {
            println("Ингредиент $request в рецепте есть")
            return
        }
    }
    println("Ингредиента в рецепте нет")
}