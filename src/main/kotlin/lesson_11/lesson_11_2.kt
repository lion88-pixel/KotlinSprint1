package lesson_11

import java.util.Scanner

class User2(
    val id: Int,
    val login: String,
    private var password: String,
    val email: String,
    var bio: String? = null
) {
    fun display() {
        println("id: $id")
        println("login: $login")
        println("email: $email")
        println("bio: ${bio ?: "нет информации"}")
    }

    fun bioNew() {
        println("введите информацию: ")
        val scanner = Scanner(System.`in`)
        bio = scanner.nextLine()
        println("bio обновлено!")
    }

    fun changePassword() {
        val scanner = Scanner(System.`in`)
        println("введите текущий пароль: ")
        val currentPassword = scanner.nextLine()

        if (currentPassword == password) {
            println("введите новый пароль: ")
            password = scanner.nextLine()
            println("пароль изменен!")
        } else {
            println("неверный пароль!")
        }
    }
}

fun main() {
    val user = User2(1, "user", "password1", "user@mail.ru")
    user.display()
    user.bioNew()
    user.changePassword()
    user.display()
}