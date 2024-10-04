import kotlin.random.Random

class PasswordGenerator {

    fun generatePassword(passwordLength: Int): String {
        var password = ""
        for (i in 1..passwordLength) {
            password += getRandomSymbolType()
        }

        return password
    }

    private fun getRandomSymbolType(): String {
        val randomType = SymbolsType.entries.shuffled().first()
        return when (randomType) {
            SymbolsType.CHAR -> {
                val isUpperCased = Random.nextBoolean()
                val value = ('A'..'Z').random().toString()
                return if (isUpperCased) {
                    value.lowercase()
                } else {
                    value
                }
            }

            SymbolsType.OTHER -> SymbolsAlphabet.alphabet.shuffled().first()
            SymbolsType.NUMBER -> Random.nextInt(0, 9).toString()
        }
    }
}