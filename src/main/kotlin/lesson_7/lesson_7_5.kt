package lesson_7

const val MIN_PASSWORD_LENGTH = 6

fun generatePassword(length: Int): String {
    if (length < MIN_PASSWORD_LENGTH) {
        return "Длина пароля должна быть не менее $MIN_PASSWORD_LENGTH символов."
    }
    val digits = "0123456789"
    val lowercase = "abcdefghijklmnopqrstuvwxyz"
    val uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    return buildString {
        append(digits.random())
        append(lowercase.random())
        append(uppercase.random())
        val allChars = digits + lowercase + uppercase
        repeat(length - 3) {
            append(allChars.random())
        }
    }
}

fun main() {
    print("Введите желаемую длину пароля (минимум $MIN_PASSWORD_LENGTH): ")
    val passwordLength = readln().toInt()
    val password = generatePassword(passwordLength)
    println(password)
}