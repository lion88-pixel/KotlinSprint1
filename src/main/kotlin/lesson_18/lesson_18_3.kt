package lesson_18


abstract class Animal(val name: String) {
    abstract fun eat()
    abstract fun sleep()
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> Ест ягоды")
    }

    override fun sleep() {
        println("$name -> Спит")
    }
}

// Класс для собаки
class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> Ест кости")
    }

    override fun sleep() {
        println("$name -> Спит")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> Ест рыбу")
    }

    override fun sleep() {
        println("$name -> Спит")
    }
}

fun main() {
    val fox = Fox("Лиса Алиса")
    val dog = Dog("Собака Боб")
    val cat = Cat("Кот Мурзик")
    val animals: List<Animal> = listOf(fox, dog, cat)

    for (animal in animals) {
        animal.eat()
    }
}