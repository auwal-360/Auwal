import kotlin.system.exitProcess
fun main(){
    print("Enter Your name:")
    val myname = readLine()?: run{
        print("Invalid input.Existing program.")
        exitProcess(1)
    }

    print("Enter your age: ")
    val myage =
        readLine()?.toIntOrNull()?:run{
            print("Invalid input.Existing program.")
            exitProcess(1)
        }
    println("Hello $myname,you are $myage years old.")
}