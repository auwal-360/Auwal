open class Person(val name: String, val age: Int) {
    fun printPersonDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}

class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    fun printStudentDetails() {
        printPersonDetails()
        println("Grade: $grade")
        println()
    }
}

fun main() {

    val stu1 = Student("Auwal", 26, "9th")
    val stu2 = Student("Ibrahim", 34, "10th")
    stu1.printStudentDetails()
    stu2.printStudentDetails()
}
