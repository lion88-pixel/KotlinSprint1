package lesson_12

import kotlin.random.Random

const val TEMPERATURE_OFFSET = 273

class WeatherInfo(
    kelvinDayTemp: Int,
    kelvinNightTemp: Int,
    city: String,
    condition: String, hasPrecipitation: Boolean
) {
    val dayTemperature: Int = kelvinDayTemp - TEMPERATURE_OFFSET
    val nightTemperature: Int = kelvinNightTemp - TEMPERATURE_OFFSET
    val city = city
    val condition = condition
    val hasPrecipitation = hasPrecipitation

    fun printWeatherInfo() {
        println("Погода в городе $city:")
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Состояние: $condition, Осадки: ${if (hasPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weatherList = List(30) {
        val dayTemp = Random.nextInt(283, 308)
        val nightTemp = Random.nextInt(278, 303)
        val city = "Город ${it + 1}"
        val condition = when (Random.nextInt(1, 4)) {
            1 -> "Солнечно"
            2 -> "Облачно"
            else -> "Дождь"
        }
        val hasPrecipitation = Random.nextBoolean()
        WeatherInfo(dayTemp, nightTemp, city, condition, hasPrecipitation)
    }
    val dayTemperatures = weatherList.map { it.dayTemperature }
    val nightTemperatures = weatherList.map { it.nightTemperature }
    val averageDayTemperature = dayTemperatures.average()
    val averageNightTemperature = nightTemperatures.average()
    val precipitationDays = weatherList.count { it.hasPrecipitation }
    println("Средняя дневная температура: ${averageDayTemperature}°C")
    println("Средняя ночная температура: ${averageNightTemperature}°C")
    println("Дней с осадками: $precipitationDays")
}