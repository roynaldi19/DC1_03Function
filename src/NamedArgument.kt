fun getFullName(first: String, middle: String, last: String): String {
    return "$first, $middle, $last"
}

fun main() {
    val fullName = getFullName(middle = "is", first = "Kotlin" , last = "Awasome")
    println(fullName)
}