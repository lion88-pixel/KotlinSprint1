package lesson_6

fun main() {
    println(
        "Добро пожаловать. Просим Вас" +
                "пройти регистрацию"
    )
    print("Введите желаемый логин:")
    val login = readln()
    print("Введите желаемый пароль:")
    val password = readln()
    println("Спасибо за регистарицию")

    while (true) {
        print("Введите логин:")
        val loginNew = readln()
        print("Введите пароль:")
        val passwordNew = readln()

        if ((login == loginNew) && (password == passwordNew)) {
            println("Авторизация пройдена. Добро пожаловать")
            break
        } else {
            println("Неверный логин или пароль. Попробуйте еще раз")
        }
    }
}