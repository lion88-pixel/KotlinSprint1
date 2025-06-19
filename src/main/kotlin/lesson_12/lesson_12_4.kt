package lesson_12

const val TEMPERATYRE = 273

class WeatherData(
    kelvinDayTemp: Int,
    kelvinNightTemp: Int,
    city: String,
    condition: String,
) {
    val dayTemperature = kelvinDayTemp - TEMPERATYRE
    val nightTemperature = kelvinNightTemp - TEMPERATYRE
    val city = city
    val condition = condition

    init {
        printWeather()
    }

    fun printWeather() {
        println("Погода в городе $city:")
        println("Дневная температура: ${dayTemperature}°C")
        println("Ночная температура: ${nightTemperature}°C")
        println("Состояние: $condition")
    }
}

fun main() {
    val weather = WeatherData(298, 291,"Воронеж", "Дождь")
}