package lesson_12

const val TEMPERATYRE = 273

class WeatherInfo(
    kelvinTemp: Int,
    val city: String,
    val condition: String,
) {
    val dayTemperature: Int = kelvinTemp - TEMPERATYRE
    var nightTemperature: Int = kelvinTemp - TEMPERATYRE
    val hasPrecipitation: Boolean = false

    fun displayWeather() {
        println("Погода в городе $city:")
        println("Дневная температура: ${dayTemperature}°С")
        println("Ночная температура: ${nightTemperature}°С")
        println("Описание: $condition")
    }
}

fun main() {
    val weather = WeatherInfo(300, "Москва", "Солнечно")
    weather.displayWeather()
}