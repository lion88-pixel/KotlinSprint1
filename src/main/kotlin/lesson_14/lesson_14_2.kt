package lesson_14

open class Liner2(
    val name: String,
    open val speed: Int = 30,
    open val capacity: Int = 1000,
    val passengerCapacity: Int = 500,
) {
    open fun load() {
        println("$name: Выдвигаем горизонтальный трап со шкафута для посадки пассажиров.")
    }

    open fun displayInfo() {
        println("Корабль: $name, Тип: Лайнер, Скорость: $speed, Вместимость: $capacity, Пассажировместимость: $passengerCapacity")
    }
}

class CargoShip2(
    name: String
) : Liner2(name = name) {
    override val speed: Int = 20
    override val capacity: Int = 5000

    override fun load() {
        println("$name: Активируем погрузочный кран для загрузки контейнеров.")
    }

    override fun displayInfo() {
        println("Корабль: $name, Тип: Грузовой, Скорость: $speed, Грузоподъемность: $capacity")
    }
}

class Icebreaker2(
    name: String,
    val canBreakIce: Boolean = true
) : Liner2(name = name) {
    override val speed: Int = 15
    override val capacity: Int = 500

    override fun load() {
        println("$name: Открываем ворота со стороны кормы для погрузки припасов.")
    }

    override fun displayInfo() {
        println("Корабль: $name, Тип: Ледокол, Скорость: $speed, Вместимость: $capacity, Может колоть лед: $canBreakIce")
    }
}

fun main() {
    val liner = Liner2("Титаник")
    val cargoShip = CargoShip2("Балкер")
    val icebreaker = Icebreaker2("Арктика")

    println("Информация о кораблях:")
    liner.displayInfo()
    cargoShip.displayInfo()
    icebreaker.displayInfo()

    println("\nПроцесс погрузки:")
    liner.load()
    cargoShip.load()
    icebreaker.load()
}