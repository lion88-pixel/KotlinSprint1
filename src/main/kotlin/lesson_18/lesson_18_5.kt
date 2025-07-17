package lesson_18

open class Shape
class Circle : Shape()
class Square : Shape()
class Point : Shape()
class Screen {

    fun draw(shape: Circle, x: Int, y: Int): String {
        return "Нарисован круг в координатах ($x, $y)"
    }

    fun draw(shape: Square, x: Int, y: Int): String {
        return "Нарисован квадрат в координатах ($x, $y)"
    }

    fun draw(shape: Point, x: Int, y: Int): String {
        return "Нарисована точка в координатах ($x, $y)"
    }

    fun draw(shape: Circle, x: Float, y: Float): String {
        return "Нарисован круг в координатах ($x, $y)"
    }

    fun draw(shape: Square, x: Float, y: Float): String {
        return "Нарисован квадрат в координатах ($x, $y)"
    }

    fun draw(shape: Point, x: Float, y: Float): String {
        return "Нарисована точка в координатах ($x, $y)"
    }
}

fun main() {
    val screen = Screen()
    val circle = Circle()
    val square = Square()
    val point = Point()
    println(screen.draw(circle, 10, 20))
    println(screen.draw(square, 5.5f, 7.8f))
    println(screen.draw(point, 1, 1))
    println(screen.draw(circle, 2.3f, 4.5f))
}

