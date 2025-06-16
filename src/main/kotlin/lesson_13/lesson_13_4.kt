package lesson_13

data class Contact5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun displayContact() {
        println("Имя: $name, Телефон: $phoneNumber, Компания: $company")
    }
}

fun main() {
    val phoneBook = mutableListOf<Contact5>()

    while (true) {
        print("Добавить контакт? (да/нет): ")
        val addContact = readlnOrNull()?.lowercase()

        if (addContact != "да") {
            break
        }

        print("Введите имя контакта: ")
        val name = readlnOrNull() ?: ""

        print("Введите номер телефона: ")
        val phoneNumberString = readlnOrNull() ?: ""
        val phoneNumber = phoneNumberString.toLongOrNull()

        if (phoneNumber == null) {
            println("Ошибка: Некорректный номер телефона. Контакт не будет добавлен.")
            continue
        }
        print("Введите название компании (или оставьте пустым): ")
        val company = readlnOrNull()
        val newContact = Contact5(name, phoneNumber, company)
        phoneBook.add(newContact)
    }
    println("\nТелефонная книга:")
    phoneBook.forEach { it.displayContact() }
}