package lesson_3

fun main() {
    val moveData = "D2-D4;0"
    val (move, moveNumber) = moveData.split(";")
    val (fromPosition, toPosition) = move.split("-")
    println("откуда: $fromPosition")
    println("куда: $toPosition")
    println("номер хода: $moveNumber")
}