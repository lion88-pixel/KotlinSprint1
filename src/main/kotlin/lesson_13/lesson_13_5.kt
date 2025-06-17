package lesson_13

data class Contact6(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun displayContact() {
        println("Имя: $name, Телефон: $phoneNumber, Компания: $company")
    }
}

fun main() {
    print("Введите имя контакта: ")
    val name = readlnOrNull() ?: ""
    print("Введите номер телефона: ")
    val phoneNumberString = readlnOrNull() ?: ""
    val phoneNumber: Long? = try {
        phoneNumberString.toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: Введен некорректный номер телефона. ${e::class.simpleName}")
        null
    }
    print("Введите название компании (или оставьте пустым): ")
    val company = readlnOrNull()
    if (phoneNumber != null) {
        val newContact = Contact6(name, phoneNumber, company)
        newContact.displayContact()
    } else {
        println("Контакт не был создан из-за ошибки в номере телефона.")
    }
}