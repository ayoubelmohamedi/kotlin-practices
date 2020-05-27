package oop.encapsulation

//here we will try to gain extra advantage of customizing our "setter()" function
fun main() {

    val maria = Girl()
    maria.actualAge = 15
    maria.age = 15
    println("Maria: actual age = ${maria.actualAge}")
    println("Maria: pretended age = ${maria.age}")

    val angela = Girl()
    angela.actualAge = 35
    angela.age = 35
    println("Angela: actual age = ${angela.actualAge}")
    println("Angela: pretended age = ${angela.age}")
}

class Girl {
    var age: Int = 0
        get() = field
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value-3
            }
        }
    var actualAge: Int = 0
}