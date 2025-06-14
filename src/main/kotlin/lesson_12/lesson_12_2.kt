package lesson_12

class WeatherReport(
    var dayTemperature: Double,
    var nightTemperature: Double,
    var hasPrecipitation: Boolean,
) {

    fun printWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (hasPrecipitation) "да" else "нет"}")
        println("-----------------")
    }
}

fun main() {
    val weatherReport = WeatherReport(
        dayTemperature = 26.5,
        nightTemperature = 17.0,
        hasPrecipitation = false
    )
    weatherReport.printWeatherInfo()
}