package lesson_17

class User(loginText: String, passwordText: String) {
    var login: String = loginText
        set(value) {
            println("Логин успешно изменен с $field на $value")
            field = value
        }
    var password: String = passwordText
        get() {
            return "*".repeat(field.length)
        }
        set(value) {
            println("Вы не можете изменить пароль!")
        }

    fun displayInfo() {
        println("Логин: $login, Пароль: $password")
    }
}

fun main() {
    val user = User("testUser", "secretPassword")
    user.displayInfo()
    user.login = "newTestUser"
    user.displayInfo()
    user.password = "newPassword"
    user.displayInfo()
}