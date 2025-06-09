package lesson_12

class WeatherInfo(kelvinTemp: Int, val city: String, val condition: String) {
    val tempCelsius: Int

    init {
        tempCelsius = kelvinTemp - 273
    }

    fun printWeather() {
        println("Погода в городе $city:")
        println("Температура: $tempCelsius°C")
        println("Состояние: $condition")
    }
}

fun main() {
    val weather = WeatherInfo(300, "Москва", "Солнечно")
    weather.printWeather()
}