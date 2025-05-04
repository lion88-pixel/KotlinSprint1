package lesson_9

fun main() {
    val omeletteIngredients = listOf(2, 50, 15)
    println("Сколько порций омлета Вы желаете?")
    val request = readln().toInt()
    val numberOfEggs = omeletteIngredients[0] * request
    val milkVolume = omeletteIngredients[1] * request
    val quantityOfOil = omeletteIngredients[2] * request
    println("На $request порции Вам понадобиться: яиц - $numberOfEggs шт., молока - $milkVolume мл, сливочного масла - $quantityOfOil гр.")
}
