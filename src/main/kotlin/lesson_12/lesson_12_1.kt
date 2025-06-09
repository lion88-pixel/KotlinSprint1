package lesson_12

class Weather {
    var dayTemperature: Double = 0.0
    var nightTemperature: Double = 0.0
    var hasPrecipitation: Boolean = false

    fun printWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (hasPrecipitation) "да" else "нет"}")
        println("---------------")
    }
}

fun main() {

    val weather1 = Weather().apply {
        dayTemperature = 25.0
        nightTemperature = 15.0
        hasPrecipitation = false
    }
    val weather2 = Weather().apply {
        dayTemperature = 18.0
        nightTemperature = 10.0
        hasPrecipitation = true
    }
    weather1.printWeatherInfo()
    weather2.printWeatherInfo()

    weather1.dayTemperature = 30.0
    weather1.nightTemperature = 20.0
    weather1.hasPrecipitation = true

    weather2.dayTemperature = 22.0
    weather2.nightTemperature = 12.0
    weather2.hasPrecipitation = false

    weather1.printWeatherInfo()
    weather2.printWeatherInfo()
}