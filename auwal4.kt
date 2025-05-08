fun main() {
    println(" The Numbers from 1 to 10 are:")
    for (i in 1..10) {
        println(i)
    }
    println("\nEven numbers between 1 to 20:")
    for (i in 1..20) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
