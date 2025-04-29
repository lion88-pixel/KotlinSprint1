package lesson_8

//'бекон',  'желтки', "пармезан", "чеснок", "петрушка", "соль"
fun main() {
    println(
        "Рецепт приготовления пасты карбонары со сливками и беконом"
    )
    println("Какой ингредиент Вы хотите в рецепте найти?")
    val viewsByDay = arrayOf("пармезан", "чеснок", "петрушка", "соль")
    val request = readln()
    for (i in viewsByDay) {
        if (i == request) {
            println("Ингредиент $request в рецепте есть")
        } else {
            println("Ингредиента в рецепте нет")
        }
    }
}







