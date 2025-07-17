package lesson_18

import kotlin.random.Random

abstract class Dice(val sides: Int) {
    fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Выпало: $result (Кость с $sides гранями)")
    }
}

class Dice4 : Dice(4)
class Dice6 : Dice(6)
class Dice8 : Dice(8)

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()
    val diceList: List<Dice> = listOf(dice4, dice6, dice8)
    diceList.forEach { dice -> dice.roll() }
}