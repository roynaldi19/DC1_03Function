fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun main() {
    val number = sumNumbers(10, 29, 30)
    println(number)

    val number2 = sumNumbers(10, 29, 30, 80, 87, 10)
    println(number2)
}