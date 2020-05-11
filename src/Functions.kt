/*two types of function in kotlin

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
//using this is fair too : fun getName(firstName: String, lastName: String) = "$firstName $lastName"
fun getName(firstName: String, lastName: String): String = "$firstName $lastName"

//default functions useful in inheritance when overriding
fun read(b: Array<Int>, off: Int = 0, len: Int = b.size) : Int {
    var i = off
    var total = 0
    while (i < len) {
        total = len + i
        i++
    }
    return total
}
