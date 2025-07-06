package lesson_17

class QuizElement(questionText: String, answerText: String) {
    var question: String = questionText
        get() {
            println("Вызван геттер для question")
            return field
        }

    var answer: String = answerText
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quizElement = QuizElement("Столица Франции?", "Париж")

    println("Вопрос: ${quizElement.question}")
    println("Ответ: ${quizElement.answer}")
    quizElement.answer = "Лондон"
    println("Новый ответ: ${quizElement.answer}")
}