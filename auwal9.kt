fun main() {
    // Create a map of students and scores
    val studentScores = mapOf(
        "X" to 85,
        "Y" to 92,
        "Z" to 65,
        "M" to 78,
        "P" to 59

    )
    println("Students who scored above 70:")
    studentScores.filter { it.value > 70 }.forEach { (name, score) ->
        println("$name: $score")
    }
}
