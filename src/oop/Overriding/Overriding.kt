package oop.Overriding

// Empty primary constructor
open class Person() {
    //use open keyword for the base func you want to override
    open fun displayAge(age: Int) {
        println("My age is $age.")
    }
}

class Girl: Person() {
    //use override keyword to change the behavior of the base function -> basically to override it.
    override fun displayAge(age: Int) {
        println("My fake age is ${age - 5}.")
    }
}

fun main(args: Array<String>) {
    val girl = Girl()
    girl.displayAge(31)
}