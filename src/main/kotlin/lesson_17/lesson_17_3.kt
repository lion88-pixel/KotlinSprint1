package lesson_17

class CloudFolder(val name: String, val numberOfFiles: Int, val isSecret: Boolean) {

    val folderName: String
        get() {
            return if (isSecret) "скрытая папка" else name
        }

    val filesCount: Int
        get() {
            return if (isSecret) 0 else numberOfFiles
        }

    fun displayInfo() {
        println("Имя папки: $folderName, Количество файлов: $filesCount, Секретная: $isSecret")
    }
}

fun main() {
    val secretFolder = CloudFolder("Очень важные файлы", 10, true)
    val publicFolder = CloudFolder("Мои фотографии", 50, false)

    println("Информация о секретной папке:")
    secretFolder.displayInfo()

    println("\nИнформация об обычной папке:")
    publicFolder.displayInfo()
}