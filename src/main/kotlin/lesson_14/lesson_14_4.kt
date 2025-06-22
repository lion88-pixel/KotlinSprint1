package lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean
) {
    open fun displayInfo() {
        println("Небесное тело: $name, Атмосфера: ${hasAtmosphere}, Пригодно для высадки: ${isSuitableForLanding}")
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val satellites: List<Satellite> = emptyList()
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding) {

    override fun displayInfo() {
        super.displayInfo()
        println("  Спутники:")
        if (satellites.isEmpty()) {
            println("    - Нет спутников")
        } else {
            for (satellite in satellites) {
                println("    - ${satellite.name}")
            }
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding)

fun main() {
    val moon1 = Satellite("Луна-1", false, false)
    val moon2 = Satellite("Луна-2", true, false)
    val planet = Planet(
        "Земля",
        true,
        true,
        listOf(moon1, moon2)
    )
    println("Информация о планете:")
    planet.displayInfo()
}