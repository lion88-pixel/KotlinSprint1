package lesson_16

class Circle(private val radius: Double) {

    companion object {
        private const val PI = 3.14
    }

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