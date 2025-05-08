package lesson_8

fun main() {

    var recipe = arrayOf("пармезан", "чеснок", "петрушка", "соль", "морковь", "лук")
    println("Список ингредиент в рецепте пасты карбонары со сливками и беконом: ")
    println(recipe.contentToString())
    println("Какой ингредиент в рецепте Вы хотите заменить?")
    val request = readln()
    val indexToReplace = recipe.indexOf(request)
    if (indexToReplace >= 0) {
        println("Какой ингредиент Вы хотели бы добавить?")
        val newIngredient = readln()
        recipe[indexToReplace] = newIngredient
        println("Готово! Вы сохранили следующий список: ${recipe.contentToString()}")
        return
    }
    println("Такого ингредиента в рецепте нет")
}