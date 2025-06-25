interface Movable {
    fun move()
}

interface Passenger {
    val maxPassengers: Int
    var currentPassengers: Int
    fun loadPassenger(count: Int)
    fun unloadPassenger(count: Int)
}

interface Cargo {
    val maxCargoWeight: Int
    var currentCargoWeight: Int
    fun loadCargo(weight: Int)
    fun unloadCargo(weight: Int)
}

class Truck(
    override val maxPassengers: Int = 1,
    override val maxCargoWeight: Int = 2
) : Movable, Passenger, Cargo {

    override var currentPassengers: Int = 0
    override var currentCargoWeight: Int = 0

    override fun move() {
        println("Грузовик едет...")
    }

    override fun loadPassenger(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("В грузовик загружено $count пассажиров. Текущее количество: $currentPassengers")
        } else {
            println("Невозможно загрузить $count пассажиров. Максимальное количество: $maxPassengers")
        }
    }

    override fun unloadPassenger(count: Int) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count
            println("Из грузовика выгружено $count пассажиров. Текущее количество: $currentPassengers")
        } else {
            println("Невозможно выгрузить $count пассажиров. Текущее количество: $currentPassengers")
        }
    }

    override fun loadCargo(weight: Int) {
        if (currentCargoWeight + weight <= maxCargoWeight) {
            currentCargoWeight += weight
            println("В грузовик загружено $weight тонн груза. Текущий вес: $currentCargoWeight")
        } else {
            println("Невозможно загрузить $weight тонн груза. Максимальный вес: $maxCargoWeight")
        }
    }

    override fun unloadCargo(weight: Int) {
        if (currentCargoWeight - weight >= 0) {
            currentCargoWeight -= weight
            println("Из грузовика выгружено $weight тонн груза. Текущий вес: $currentCargoWeight")
        } else {
            println("Невозможно выгрузить $weight тонн груза. Текущий вес: $currentCargoWeight")
        }
    }
}

class Car(
    override val maxPassengers: Int = 3
) : Movable, Passenger {

    override var currentPassengers: Int = 0

    override fun move() {
        println("Легковой автомобиль едет...")
    }

    override fun loadPassenger(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("В легковой автомобиль загружено $count пассажиров. Текущее количество: $currentPassengers")
        } else {
            println("Невозможно загрузить $count пассажиров. Максимальное количество: $maxPassengers")
        }
    }

    override fun unloadPassenger(count: Int) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count
            println("Из легкового автомобиля выгружено $count пассажиров. Текущее количество: $currentPassengers")
        } else {
            println("Невозможно выгрузить $count пассажиров. Текущее количество: $currentPassengers")
        }
    }
}

fun main() {
    val truck = Truck()
    val car1 = Car()
    val car2 = Car()
    println("Перевозим груз:")
    truck.loadCargo(2)
    truck.move()
    println("\nПеревозим пассажиров:")
    truck.loadPassenger(1)
    car1.loadPassenger(3)
    car2.loadPassenger(2)
    truck.move()
    car1.move()
    car2.move()
}