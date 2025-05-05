package lesson_9

fun main() {
    val omeletteIngredients = listOf(2, 50, 15)
    println("Сколько порций омлета Вы желаете?")
    val request = readln().toInt()

    val quantityOfIngredients = omeletteIngredients.map {
        it * request
    }
    println("На $request порции Вам понадобиться: яиц - ${quantityOfIngredients[0]} шт., молока - ${quantityOfIngredients[1]} мл, сливочного масла - ${quantityOfIngredients[2]} гр.")
}