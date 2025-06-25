interface AccessorySearchable {
    fun searchAccessories(): String
}

open class Product(
    val name: String,
    val quantity: Int
) {
    fun displayInfo() {
        println("Название: $name, Количество на складе: $quantity")
    }
}

class Instrument(
    name: String,
    quantity: Int,
    val type: String
) : Product(name, quantity), AccessorySearchable {

    override fun searchAccessories(): String {
        return "Выполняется поиск комплектующих для $type $name..."
    }

    fun displayInstrumentInfo() {
        displayInfo()
        println("Тип инструмента: $type")
    }
}

class Accessory(
    name: String,
    quantity: Int,
    val instrumentType: String
) : Product(name, quantity) {

    fun displayAccessoryInfo() {
        displayInfo()
        println("Подходит для: $instrumentType")
    }
}

fun main() {
    val guitar = Instrument("Fender Stratocaster", 5, "Электрогитара")
    val strings = Accessory("Струны Ernie Ball", 20, "Электрогитара")
    println("Информация об инструменте:")
    guitar.displayInstrumentInfo()
    println(guitar.searchAccessories())
    println("\nИнформация о комплектующем:")
    strings.displayAccessoryInfo()
}