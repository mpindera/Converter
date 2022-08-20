fun main(args: Array<String>) {
    convert()
}

fun convert() {
    print("Enter a number and a measure of length: ")
    val (number, name) = readln().split(" ")
    val num = number.toDouble()
    when (name.lowercase()) {
        "km", "kilometer", "kilometers" -> {
            if (num == 1.0) println("$num kilometer is ${num * 1000} meters")
            else println("$num kilometers is ${num * 1000} meters")
        }
        else -> println("Wrong input. Unknown unit $name")
    }
}
