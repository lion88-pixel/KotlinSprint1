package lesson_18

abstract class Animal(val name: String) {
    abstract fun eat()

    fun sleep() {
        println("$name -> Спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> Ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> Ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> Ест рыбу")
    }
}

fun main() {
    val fox = Fox("Лиса Алиса")
    val dog = Dog("Собака Боб")
    val cat = Cat("Кот Мурзик")
    val animals: List<Animal> = listOf(fox, dog, cat)

    for (animal in animals) {
        animal.eat()
        animal.sleep()
    }
}