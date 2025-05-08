class Car(val brand: String, val model: String, val year: Int) {
    fun displayDetails() {
        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")
        println()

    }
}
fun main(){
    class Car
    val car1 = Car("Toyota"," camry",2015)
    val car2 = Car("Honda"," accord",2016)
    car1.displayDetails()
    car2.displayDetails()
}
