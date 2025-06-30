package lesson_16

class Order(val orderNumber: Int, private var status: String = "Принят") {

    internal fun changeStatus(newStatus: String) {
        status = newStatus
        println("Статус заказа №$orderNumber изменен на: $status")
    }

    fun requestStatusChange(newStatus: String, manager: Manager) {
        manager.changeOrderStatus(this, newStatus)
    }

    fun getStatus(): String {
        return status
    }

    fun displayOrderInfo() {
        println("Заказ №$orderNumber, Статус: $status")
    }
}

class Manager {
    fun changeOrderStatus(order: Order, newStatus: String) {
        order.changeStatus(newStatus)
    }
}

fun main() {
    val manager = Manager()
    val order = Order(12345)
    order.displayOrderInfo()
    order.requestStatusChange("В обработке", manager)
    order.requestStatusChange("Отправлен", manager)
    order.displayOrderInfo()
}