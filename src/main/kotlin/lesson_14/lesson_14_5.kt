package lesson_14

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextMessageId = 1

    fun addMessage(text: String, author: String) {
        val message = Message(nextMessageId++, text, author)
        messages.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val parentMessage = messages.find { it.id == parentMessageId }
        if (parentMessage != null) {
            val childMessage = ChildMessage(nextMessageId++, text, author, parentMessageId)
            messages.add(childMessage)
        } else {
            println("Ошибка: Сообщение с ID $parentMessageId не найдено.")
        }
    }

    fun printChat() {
        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }

        groupedMessages.forEach { (parentId, messageGroup) ->
            messageGroup.forEach { message ->
                if (message is ChildMessage) {
                    print("\t") // Tab для отступов
                }
                println("${message.author}: ${message.text}")
            }
        }
    }
}

open class Message(
    val id: Int,
    val text: String,
    val author: String
)

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageId: Int
) : Message(id, text, author)

fun main() {
    val chat = Chat()

    chat.addMessage("Привет всем!", "Алиса")
    chat.addMessage("Как дела?", "Боб")
    chat.addThreadMessage("Привет Алиса и Боб!", "Чарли", 1)
    chat.addThreadMessage("У меня все хорошо, спасибо!", "Боб", 2)
    chat.addThreadMessage("Я тоже в порядке.", "Алиса", 3)
    chat.addMessage("Всем спасибо, я пошел", "Дейв")
    chat.addThreadMessage("Удачи Дейв!", "Чарли", 6)
    chat.printChat()
}