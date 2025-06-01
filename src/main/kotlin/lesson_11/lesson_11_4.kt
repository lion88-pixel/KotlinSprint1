package lesson_11

data class Category(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val recipes: List<Recipe>
)

data class Recipe(
    val id: Int,
    val title: String,
    val description: String,
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
    val cakeRecipe = Recipe(
        id = 1,
        title = "Шоколадный торт",
        description = "Торт на праздник.",
        ingredients = listOf(ingredient1, ingredient2, ingredient3),
        instructions = "Смешайте ингредиенты, выпекайте 30 минут при 160°C.",
        imageUrl = "https://example.com/chokolate_cake.jpg"
    )
    val dessertCategory = Category(
        id = 1,
        name = "Десерты",
        imageUrl = "https://example.com/desserts.jpg",
        recipes = listOf(cakeRecipe)
    )
    println(dessertCategory)
}