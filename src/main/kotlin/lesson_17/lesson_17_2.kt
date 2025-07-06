package lesson_17

class Ship(val name: String, val averageSpeed: Int, val homePort: String) {

    init {
        println("Корабль '$name' создан. Скорость: $averageSpeed, Порт: $homePort")
    }

    var currentHomePort: String = homePort
        set(value) {
            println("Меняем порт приписки корабля '$name' на '$value'")
            field = value
        }

    fun displayInfo() {
        println("Имя корабля: $name, Скорость: $averageSpeed, Порт приписки: $currentHomePort")
    }
}

fun main() {
    val ship = Ship("Aurora", 25, "Санкт-Петербург")
    ship.displayInfo()
    ship.currentHomePort = "Владивосток"
    ship.displayInfo()
}