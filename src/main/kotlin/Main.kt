fun main() {
    val passwordGenerator = PasswordGenerator()
    print("Введите длину пароля: ")
    val passwordLength = readln().toInt()
    println("Сгенерированный пароль: ${passwordGenerator.generatePassword(passwordLength)}")
}
