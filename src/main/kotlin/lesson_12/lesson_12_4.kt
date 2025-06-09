package lesson_12

class WeatherData(kelvinTemp: Int, cityName: String, weatherCondition: String) {

    val temperatureCelsius: Int
    val city: String = cityName
    val condition: String = weatherCondition

    init {
        temperatureCelsius = kelvinTemp - 273
        printWeather()
    }

    fun printWeather() {
        println("Погода в городе $city:")
        println("Температура: $temperatureCelsius°C")
        println("Состояние: $condition")
    }
}

fun main() {
    val weather = WeatherData(300, "Воронеж", "Дождь")
}