import kotlin.random.Random

class PasswordGenerator {

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