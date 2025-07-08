package lesson_17

class Package(val packageNumber: Int, initialLocation: String) {
    var currentLocation: String = initialLocation
        set(value) {
            moveCount++
            println("Посылка №$packageNumber перемещена из $field в $value.")
            field = value
        }

    var moveCount: Int = 0
        private set

    fun displayInfo() {
        println("Посылка №$packageNumber, Текущее местоположение: $currentLocation, Количество перемещений: $moveCount")
    }
}

fun main() {
    val package1 = Package(12345, "Москва")
    package1.displayInfo()
    package1.currentLocation = "Санкт-Петербург"
    package1.displayInfo()
    package1.currentLocation = "Казань"
    package1.displayInfo()
}