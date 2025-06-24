package lesson_15

abstract class WeatherStationStats {
    abstract val value: Double
    abstract val unit: String
}

object Temperature : WeatherStationStats() {
    override val value = 25.5
    override val unit = " °C"
}

object PrecipitationAmount : WeatherStationStats() {
    override val value = 5.2   // Пример количества осадков
    override val unit = " мм"
}

class WeatherServer {
    fun sendData(data: WeatherStationStats) {
        when (data) {
            is Temperature -> println("Отправка данных о температуре: ${data.value}${data.unit}")
            is PrecipitationAmount -> println("Отправка данных об осадках: ${data.value}${data.unit}")
            else -> println("Неизвестный тип данных: $data")
        }
    }
}

fun main() {
    val server = WeatherServer()
    server.sendData(Temperature)
    server.sendData(PrecipitationAmount)
}