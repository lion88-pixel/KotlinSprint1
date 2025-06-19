package lesson_13

data class Contact7(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun displayContact() {
        println("Имя: $name, Телефон: $phoneNumber, Компания: ${company ?: "Не указана"}")
    }
}

fun main() {
    val phoneBook = mutableListOf<Contact7>()
    while (true) {
        print("Добавить контакт? (да/нет): ")
        val addContact = readlnOrNull()?.lowercase()
        if (addContact != "да") {
            break
        }
        print("Введите имя контакта: ")
        val name = readlnOrNull() ?: ""
        print("Введите номер телефона: ")
        val phoneNumber = readlnOrNull()?.toLongOrNull()
        if (phoneNumber == null) {
            println("Ошибка: Некорректный номер телефона. Контакт не будет добавлен.")
            continue
        }
        print("Введите название компании (или оставьте пустым): ")
        var company = readlnOrNull()
        if (company.isNullOrEmpty()) {
            company = null
        }
        val newContact = Contact7(name, phoneNumber, company)
        phoneBook.add(newContact)
    }
    println("\nТелефонная книга:")
    phoneBook.forEach { it.displayContact() }
}