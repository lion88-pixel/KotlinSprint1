package lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

fun main(){
    val contact1 = Contact("Александр Александров", 89263170915, "МК-М")
    val contact2 = Contact("Петр Петров", 89256676715, null)
    println(contact1.name+" "+contact1.phoneNumber+" "+contact1.company)
    println(contact2.name+" "+contact2.phoneNumber+" "+contact2.company)
}