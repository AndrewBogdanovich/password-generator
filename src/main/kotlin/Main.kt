import kotlin.random.Random

fun main() {
    val passwordGenerator = PasswordGenerator()
    println("Введите длину пароля: ")
    val passwordLength = readln().toInt()
    println("Сгенерированный пароль: ${passwordGenerator.generatePassword(passwordLength)}")
}

class PasswordGenerator() {

    companion object {
        const val PASSWORD_LENGTH = 8
    }


    fun generatePassword(passwordLength: Int): String {
        var password = ""
        for (i in 1..passwordLength) {
            if (i % 2 == 0) {
                val charRange = ('A'..'Z').random()
                password += charRange
            } else {
                password += (Random.nextInt(0, 9).toString())
            }
        }
        return password
    }
}