abstract class User(val name: String) {
    abstract fun readForum()
    abstract fun writeMessage(message: String)
}

class RegularUser(name: String) : User(name) {
    override fun readForum() {
        println("$name: Читает форум.")
    }

    override fun writeMessage(message: String) {
        println("$name: Отправляет сообщение: \"$message\"")
    }
}

class Administrator(name: String) : User(name) {
    override fun readForum() {
        println("$name (Администратор): Читает форум.")
    }

    override fun writeMessage(message: String) {
        println("$name (Администратор): Отправляет сообщение: \"$message\"")
    }

    fun deleteMessage(message: String) {
        println("$name (Администратор): Удаляет сообщение: \"$message\"")
    }

    fun deleteUser(user: User) {
        println("$name (Администратор): Удаляет пользователя: ${user.name}")
    }
}

fun main() {
    val regularUser1 = RegularUser("Алиса")
    val regularUser2 = RegularUser("Боб")
    val admin = Administrator("Чарли")
    regularUser1.readForum()
    regularUser1.writeMessage("Привет всем!")
    regularUser2.readForum()
    regularUser2.writeMessage("Я согласен с Алисой.")
    admin.readForum()
    admin.writeMessage("Внимание всем!")
    admin.deleteMessage("Я согласен с Алисой.")
    admin.deleteUser(regularUser2)
}