package lesson_14

import kotlin.math.PI

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    val figures = listOf(
        Circle("черный", 5.0),
        Rectangle("белый", 4.0, 6.0),
        Circle("белый", 3.0),
        Rectangle("черный", 2.0, 8.0),
        Circle("черный", 7.0),
        Rectangle("белый", 5.0, 5.0)
    )
    val sumBlackPerimeters = figures.filter { it.color == "черный" }
        .sumOf { it.calculatePerimeter() }
    val sumWhiteAreas = figures.filter { it.color == "белый" }
        .sumOf { it.calculateArea() }
    println("Сумма периметров всех черных фигур: $sumBlackPerimeters")
    println("Сумма площадей всех белых фигур: $sumWhiteAreas")
}