package lesson_17

class QuizElement(val question: String, var answer: String) {
    init {
        println("QuizElement создан с вопросом: $question и ответом: $answer")
    }

    val questionLength: Int
        get() = question.length
}

fun main() {
    val quizElement = QuizElement("Столица Франции?", "Париж")
    println("Вопрос: ${quizElement.question}")
    println("Ответ: ${quizElement.answer}")
    quizElement.answer = "Лондон"
    println("Новый ответ: ${quizElement.answer}")
    println("Длина вопроса ${quizElement.questionLength}")
}