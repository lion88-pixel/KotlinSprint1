package lesson_15

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class Carp : Swimming {
    override fun swim() {
        println("Карась плавает в пруду.")
    }
}

class Seagull : Flying, Swimming {
    override fun fly() {
        println("Чайка летает над морем.")
    }

    override fun swim() {
        println("Чайка плавает по волнам.")
    }
}

class Duck : Flying, Swimming {
    override fun fly() {
        println("Утка летит в теплые края.")
    }

    override fun swim() {
        println("Утка плавает в озере.")
    }
}

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    println("Способы передвижения существ:")
    carp.swim()
    seagull.fly()
    seagull.swim()
    duck.fly()
    duck.swim()
}

