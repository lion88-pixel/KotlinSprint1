package lesson_17

class Ship(averageSpeed: Int, homePort: String) {

    var name: String = "Без имени"
        set(value) {
            println("Нельзя менять имя корабля!")
        }

    var averageSpeed: Int = averageSpeed
        get() = field
        set(value) {
            println("Изменение средней скорости корабля на $value")
            field = value
        }
    var homePort: String = homePort
        get() = field
        set(value) {
            println("Изменение порта корабля на $value")
            field = value
        }

    init {
        println("Корабль '$name' создан. Скорость: $averageSpeed, Порт: $homePort")
    }

    fun displayInfo() {
        println("Имя корабля: $name, Скорость: $averageSpeed, Порт приписки: $homePort")
    }
}

fun main() {
    val ship = Ship(25, "Санкт-Петербург")
    ship.displayInfo()
    ship.name = "NewName"
    ship.averageSpeed = 30
    ship.homePort = "Владивосток"
    ship.displayInfo()
}