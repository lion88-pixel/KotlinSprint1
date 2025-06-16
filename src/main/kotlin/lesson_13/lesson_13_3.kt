package lesson_13

data class ContactInfo(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
)

fun main() {

    val contacts = listOf(
        ContactInfo("Александр", 89263170915, null),
        ContactInfo("Петр", 89256676715, "MK-M"),
        ContactInfo("Василий", 89285476715, null),
        ContactInfo("Сергей", 89256658725, "null"),
        ContactInfo("Игорь", 89256676578, "ЗаряСталь")
    )
    val companies = contacts.mapNotNull { it.company }.toSet()
    println("Список компаний в телефонной книге:")
    companies.forEach {
        println(it)
    }
}