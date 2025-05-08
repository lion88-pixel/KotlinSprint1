package lesson_9

fun main() {
       println("Введите 5 ингредиентов, разделенных запятой и пробелом (\", \"): ")
    val input = readln()
    val recipe = input.split(", ").sorted()
        println("Отсортированный список ингредиентов: $recipe")
}