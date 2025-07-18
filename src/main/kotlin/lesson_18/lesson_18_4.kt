package lesson_18

import kotlin.math.pow

abstract class Box {
    abstract fun calculateSurfaceArea(): Double
}

class RectangularBox(val length: Double, val width: Double, val height: Double) : Box() {
    override fun calculateSurfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class CubeBox(val side: Double) : Box() {
    override fun calculateSurfaceArea(): Double {
        return 6 * side.pow(2)
    }
}

fun main() {
    val rectangularBox = RectangularBox(10.0, 5.0, 3.0)
    val cubeBox = CubeBox(7.0)
    println("Площадь поверхности прямоугольной коробки: ${rectangularBox.calculateSurfaceArea()}")
    println("Площадь поверхности кубической коробки: ${cubeBox.calculateSurfaceArea()}")
}