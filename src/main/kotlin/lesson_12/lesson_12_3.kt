package lesson_12

const val TEMPERATYRE = 273

class WeatherInfo(
    kelvinDayTemp: Int,
    kelvinNightTemp: Int,
    city: String,
    condition: String,
) {
    val dayTemperature: Int = kelvinDayTemp - TEMPERATYRE
    val nightTemperature: Int = kelvinNightTemp - TEMPERATYRE
    val city: String = city
    val condition: String = condition

    fun displayWeather() {
        println("Погода в городе $city:")
        println("Дневная температура: ${dayTemperature}°С")
        println("Ночная температура: ${nightTemperature}°С")
        println("Описание: $condition")
    }
}

fun main() {
    val weather = WeatherInfo(300, 293, "Москва", "Солнечно")
    weather.displayWeather()
}