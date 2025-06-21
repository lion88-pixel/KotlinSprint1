package lesson_14

open class Liner(
    val name: String,
    open val speed: Int = 30,
    open val capacity: Int = 1000,
    val passengerCapacity: Int = 500,
) {
    open fun displayInfo() {
        println("Корабль: $name, Тип: Лайнер, Скорость: $speed, Вместимость: $capacity, Пассажировместимость: $passengerCapacity")
    }
}

class CargoShip(
    name: String
) : Liner(name = name) {
    override val speed: Int = 20
    override val capacity: Int = 5000
    override fun displayInfo() {
        println("Корабль: $name, Тип: Грузовой, Скорость: $speed, Грузоподъемность: $capacity")
    }
}

class Icebreaker(
    name: String,
    val canBreakIce: Boolean = true
) : Liner(name = name) {
    override val speed: Int = 15
    override val capacity: Int = 500
    override fun displayInfo() {
        println("Корабль: $name, Тип: Ледокол, Скорость: $speed, Вместимость: $capacity, Может колоть лед: $canBreakIce")
    }
}

fun main() {
    val liner = Liner("Титаник")
    val cargoShip = CargoShip("Балкер")
    val icebreaker = Icebreaker("Арктика")

    liner.displayInfo()
    cargoShip.displayInfo()
    icebreaker.displayInfo()
}