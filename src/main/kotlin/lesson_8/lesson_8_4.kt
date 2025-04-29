package lesson_8

fun main() {

    var recipe = arrayOf("пармезан", "чеснок", "петрушка", "соль", "морковь", "лук")
    println("Список ингредиент в рецепте пасты карбонары со сливками и беконом: ")
    println(recipe.contentToString())
    println("Какой ингредиент в рецепте Вы хотите заменить?")
    val request = readln()
    var indexToReplace = 1
    for (i in recipe) {
        if (request == i) {
            println("Какой ингредиент Вы хотели бы добавить?")
            val recipe1 = readln()
                      recipe[indexToReplace] = recipe1
            println("Готово! Вы сохранили следующий список: ${recipe.contentToString()}")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}