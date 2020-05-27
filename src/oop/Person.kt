package oop

//primary constructor
//The primary constructor is part of the class header: it goes after the class name (and optional type parameters).
class Person(name: String, personAge: Int) {

    //initialize variable immediately after being created
    //or use "laterinit" keyword to let kotlin know you will initialize the variable later
    private val fullName: String = name
    private var age: Int = personAge

    // initializer block is prefixed with "init"
    init {
        println("full name = $fullName")
        println("age = $age")
    }
 }