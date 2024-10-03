import kotlin.random.Random

fun main() {
    val passwordGenerator = PasswordGenerator()
    println("Сгенерированный пароль: ${passwordGenerator.generatePassword()}")
}

class PasswordGenerator() {

    companion object {
        const val PASSWORD_LENGTH = 8
    }


    fun generatePassword(): String{
        var password = ""
        for (i in 1..PASSWORD_LENGTH) {
            if (i % 2 == 0) {
                val charRange = ('A'..'Z').random()
                password += charRange
            }
            else {
                password += (Random.nextInt(0,9).toString())
            }
        }
        return password
    }
}