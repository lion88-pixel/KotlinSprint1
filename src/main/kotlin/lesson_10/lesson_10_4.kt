package lesson_10

fun rollTheDice(): Int {
    return (1..7).random()
}

fun playerRoll(): Boolean {
    val playerThrow = rollTheDice()
    println("Ход пользователя. Значение броска $playerThrow")
    val computerThrow = rollTheDice()
    println("Ход компьютера. Значение броска $computerThrow")
    return playerThrow > computerThrow
}

fun main() {
    var playerWins = 0
    println("Игра: Бросаем кости!")
    while (true) {
        val playerWonRound = playerRoll()

        if (playerWonRound) {
            println("Победило человечество")
            playerWins++
        } else {
            println("Победила машина или дружба")
        }
        print("Хотите бросить кубики ещё раз? Введите да или нет: ")
        val answer = readln()

        if (answer.equals("нет", ignoreCase = true))
            break
    }
    println("Игра окончена. Вы выиграли $playerWins партий")
}
