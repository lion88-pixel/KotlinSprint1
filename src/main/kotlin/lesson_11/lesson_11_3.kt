package lesson_11

data class Participant(
    val nickname: String,
    var status: String,
)

class Room(
    val cover: String,
    val title: String,
    private val participants: MutableList<Participant> = mutableListOf()
) {

    fun addParticipant(participant: Participant) {
        participants.add(participant)
        println("${participant.nickname} присоединился к комнате \"$title\".")
    }

    fun updateStatus(nickname: String, newStatus: String) {
        val participant = participants.find { it.nickname == nickname }
        if (participant != null) {
            participant.status = newStatus
            println("Статус участника \"$nickname\" обновлен на \"$newStatus\".")
        } else {
            println("Участник с именем \"$nickname\" не найден.")
        }
    }

    fun displayInfo() {
        println("Комната: $title")
        println("Обложка: $cover")
        println("Участники:")
        if (participants.isEmpty()) {
            println("Нет участников.")
        } else {
            participants.forEach {
                println("${it.nickname} - статус: ${it.status}")
            }
        }
        println()
    }
}

fun main() {
    val room = Room("Обложка комнаты", "Голосовой чат по интересам")
    val participant1 = Participant("user1", "разговаривает")
    val participant2 = Participant("user2", "микрофон выключен")

    room.addParticipant(participant1)
    room.addParticipant(participant2)
    room.updateStatus("user1", "пользователь заглушен")
    room.displayInfo()
}