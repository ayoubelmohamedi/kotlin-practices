package oop.Functions

fun main() {
    println("without argument")
    printName()

    println("using argument")
    printName("Ayoub", 20)

    //Named arg, is used to specify which arg we want to set (like passing the second arg and left the first one as default)
    println("Named arguments")
    printName(age = 45)

}

//function with default args if nothing passed
fun printName(name: String = "none", age: Int = 0) {
    println("Name is $name, age = $age")
}

