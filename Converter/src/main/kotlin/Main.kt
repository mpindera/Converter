fun main(args: Array<String>) {
    convert()
}

fun convert() {
    print("Enter a number and a measure of length: ")
    val (number, name) = readln().split(" ")
    val num = number.toDouble()
    when (name.lowercase()) {
        "m", "meter", "meters" -> {
            if (num == 1.0) println("$num meter is $num meter")
            else println("$num meters is $num meters")
        }
        "km", "kilometer", "kilometers" -> {
            if ((num * 1000) == 1.0) println("$num kilometers is ${num * 1000} meter")
            else if (num == 1.0) println("$num kilometer is ${num * 0.001} meters")
            else println("$num kilometers is ${num * 1000} meters")
        }
        "cm", "centimeter", "centimeters" -> {
            if ((num * 0.01) == 1.0) println("$num centimeters is ${num * 0.01} meter")
            else if (num == 1.0) println("$num centimeter is ${num * 0.001} meters")
            else println("$num centimeters is ${num * 0.01} meters")
        }
        "mm", "millimeter", "millimeters" -> {
            if ((num * 0.001) == 1.0) println("$num millimeters is ${num * 0.001} meter")
            else if (num == 1.0) println("$num millimeter is ${num * 0.001} meter")
            else println("$num millimeters is ${num * 0.001} meters")
        }
        "mi", "mile", "miles" -> {
            if ((num * 1609.35) == 1.0) println("$num miles is ${num * 1609.35} meter")
            else if (num == 1.0) println("$num mile is ${num * 1609.35} meters")
            else println("$num miles is ${num * 1609.35} meters")
        }
        "yd", "yard", "yards" -> {
            if ((num * 0.9144) == 1.0) println("$num yards is ${num * 0.9144} meter")
            else if (num == 1.0) println("$num yard is ${num * 0.001} meters")
            else println("$num yards is ${num * 0.9144} meters")
        }
        "ft", "foot", "feet" -> {
            if ((num * 0.3048) == 1.0) println("$num feet is ${num * 0.3048} meter")
            else if (num == 1.0) println("$num foot is ${num * 0.001} meters")
            else println("$num feet is ${num * 0.3048} meters")
        }
        "in", "inch", "inches" -> {
            if ((num * 0.0254) == 1.0) println("$num inches is ${num * 0.0254} meter")
            else if (num == 1.0) println("$num inch is ${num * 0.001} meters")
            else println("$num inches is ${num * 0.0254} meters")
        }
        else -> println("Wrong input. Unknown unit $name")
    }
}

