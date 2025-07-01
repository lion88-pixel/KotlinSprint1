package lesson_16

private const val PI = 3.14

class Circle(private val radius: Double) {

    fun calculateCircumference(): Double {
        return 2 * PI * radius
    }

    fun calculateArea(): Double {
        return PI * radius * radius
    }

    fun displayInfo() {
        println("Радиус круга: $radius")
        println("Длина окружности: ${calculateCircumference()}")
        println("Площадь круга: ${calculateArea()}")
    }
}

fun main() {
    val circle = Circle(5.0)
    circle.displayInfo()
}