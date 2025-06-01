package lesson_11

data class Category(
    val id: Int,
    val name: String,
    val imageUrl: String,
)

data class Recipe(
    val id: Int,
    val title: String,
    val description: String,
    val category: Category,
    val ingredients: List<Ingredient>,
    val instructions: String,
    val imageUrl: String,
)

data class Ingredient(
    val name: String,
    val quantity: String,
    val unit: String,
)

fun main() {

    val ingredient1 = Ingredient("Мука", "200", "гр")
    val ingredient2 = Ingredient("Сахар", "100", "гр")
    val ingredient3 = Ingredient("Яйцо", "2", "шт")

    val category = Category(1, "Выпечка", "https://example.com/baking.jpg")

    val recipe = Recipe(
        id = 1,
        title = "Торт",
        description = "Торт на праздник.",
        category = category,
        ingredients = listOf(ingredient1, ingredient2, ingredient3),
        instructions = "Смешайте ингредиенты, выпекайте 30 минут при 160°C.",
        imageUrl = "https://example.com/cake.jpg"
    )
    println(recipe)
}