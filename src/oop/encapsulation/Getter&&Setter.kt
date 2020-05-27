package oop.encapsulation

//In Kotlin, getters and setters are optional and are auto-generated if you do not create them in your program.
//the following code
/*
class Person {
    var name: String = "defaultValue"
}
*/
//is equivalent to

class Person {
    var name: String = "defaultValue"

        // getter
        get() = field

        // setter
        set(value) {
            field = value
        }
}

fun main() {
    val person1 = Person()
    //using getter
    println(person1.name)
    //using setter
    person1.name = "New name"
    println(person1.name)
}