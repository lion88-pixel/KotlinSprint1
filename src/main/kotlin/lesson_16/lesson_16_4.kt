package lesson_16

class Order(val orderNumber: Int, private var status: String = "Принят") {

    fun requestStatusChange(newStatus: String) {
        changeStatus(newStatus)
    }

    private fun changeStatus(newStatus: String) {
        status = newStatus
        println("Статус заказа №$orderNumber изменен на: $status")
    }

    fun displayOrderInfo() {
        println("Заказ №$orderNumber, Статус: $status")
    }
}

fun main() {
    val order = Order(12345)
    order.displayOrderInfo()
    order.requestStatusChange("В обработке")
    order.requestStatusChange("Отправлен")
    order.displayOrderInfo()
}