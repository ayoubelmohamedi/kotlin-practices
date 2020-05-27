package oop

//primary constructor

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