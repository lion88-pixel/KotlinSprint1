package lesson_13

class ContactInfo1(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {

    fun printContact() {
        val companyText = company ?: "<не указано>"
        println("- Имя:$name\n- Номер:$phoneNumber\n- Компания:$companyText")
    }
}
    fun main() {
        val contact1 = ContactInfo1("Александр", 89263170915)
        val contact2 = ContactInfo1("Петр", 89256676715, "MK-M")
        contact1.printContact()
        contact2.printContact()
}