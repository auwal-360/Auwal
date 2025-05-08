import kotlin.system.exitProcess

fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull() ?: run {
        println("Invalid input. Exiting program.")
        exitProcess(1)
    }

    if (number % 2 == 0) {
        println("$number is even.")
    } else {
        println("$number is odd.")
    }
}
