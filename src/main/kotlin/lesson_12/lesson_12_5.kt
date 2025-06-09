package lesson_12

import kotlin.random.Random

class DailyWeather(kelvinDayTemp: Int, kelvinNightTemp: Int, val hasPrecipitation: Boolean) {

    val dayTempCelsius: Int = kelvinDayTemp - 273
    val nightTempCelsius: Int = kelvinNightTemp - 273

    fun printInfo() {
        println("День: $dayTempCelsius°C, Ночь: $nightTempCelsius°C, Осадки: $hasPrecipitation")
    }
}

fun main() {
    val monthWeather = mutableListOf<DailyWeather>()
    repeat(30) {
        val dayKelvin = Random.nextInt(270, 310)  // Температура днем в Кельвинах (примерно -3..37°C)
        val nightKelvin = Random.nextInt(260, 300) // Температура ночью
        val precipitation = Random.nextBoolean()   // Есть осадки или нет
        val dailyWeather = DailyWeather(dayKelvin, nightKelvin, precipitation)
        monthWeather.add(dailyWeather)
    }
    val dayTemps = monthWeather.map { it.dayTempCelsius }
    val nightTemps = monthWeather.map { it.nightTempCelsius }
    val avgDayTemp = dayTemps.average()
    val avgNightTemp = nightTemps.average()
    val precipitationDays = monthWeather.count { it.hasPrecipitation }
    println("Средняя дневная температура за месяц: ${"%.1f".format(avgDayTemp)}°C")
    println("Средняя ночная температура за месяц: ${"%.1f".format(avgNightTemp)}°C")
    println("Количество дней с осадками: $precipitationDays")
}