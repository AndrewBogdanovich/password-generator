fun main() {
    val passwordGenerator = PasswordGenerator()
    println("Введите длину пароля: ")
    val passwordLength = readln().toInt()
    println("Сгенерированный пароль: ${passwordGenerator.generatePassword(passwordLength)}")
}