package lesson_16

class Player(val name: String, private var health: Int, private var attackPower: Int) {

    private var isDead: Boolean = false

    private fun handleDeath() {
        if (isDead) return
        println("$name умер!")
        isDead = true
        health = 0
        attackPower = 0
    }

    fun takeDamage(damage: Int) {
        if (isDead) {
            println("$name мертв и не может получать урон!")
            return
        }

        health -= damage
        println("$name получил $damage урона. Здоровье: $health")
        if (health <= 0) {
            handleDeath()
        }
    }

    fun heal(amount: Int) {
        if (isDead) {
            println("$name мертв и не может лечиться!")
            return
        }
        health += amount
        println("$name вылечился на $amount. Здоровье: $health")
    }


    fun getAttackPower(): Int {
        return if (isDead) 0 else attackPower
    }

    fun displayInfo() {
        println("Имя: $name, Здоровье: $health, Сила удара: $attackPower, Мертв: $isDead")
    }
}

fun main() {
    val player = Player("Герой", 100, 20)
    player.displayInfo()
    player.takeDamage(10)
    player.heal(5)
    player.takeDamage(30)
    player.takeDamage(65)
    player.heal(10)
    player.takeDamage(10)

    player.displayInfo()
}