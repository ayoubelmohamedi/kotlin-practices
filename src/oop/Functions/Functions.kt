package oop.Functions/*two types of function in kotlin

-- Kotlin Standard Library Function
-- User-defined functions


 */
fun main() {
    var number = 5.5
    //return square root of a number
    val result = Math.sqrt(number)

    println(addNumber(number, result))
    var res = addNumber(5.3, 4.1) + 1
    println(res)
    addMyName("Ayoub")
    println(getName("Ayoub", "Elmohamedi"))
    val s = MyClass()
    //infix function with()
    s with "Karim"
    //print pyramid structure using infix func.
    val p = Structure()
    p createPyramid 7

}

fun addNumber(n1: Double, n2: Double): Int {
    val sum = n1 + n2
    val sumInt = sum.toInt()
    return sumInt
}

// the function doesn't return any value (return type is Unit).
fun addMyName(myName: String) {
    println("my name is $myName")
}

//two arg type String and result type String, with = instead of curly braces {}
//using this is fair too : fun oop.Functions.getName(firstName: String, lastName: String) = "$firstName $lastName"
fun getName(firstName: String, lastName: String): String = "$firstName $lastName"

//default functions useful in inheritance when overriding
fun read(b: Array<Int>, off: Int = 0, len: Int = b.size): Int {
    var i = off
    var total = 0
    while (i < len) {
        total = len + i
        i++
    }
    return total
}

//Infix function like "or" & "and" instead of ".or(arg)" || ".and()"
//it must be a member fun and contain only one parameter.
class MyClass() {
    infix fun with(name: String) {
        println("you are friend of $name")
    }
}

//another infix fun
class Structure() {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows - i) {
                print("  ")
            }
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}
