package oop

//primary constructor

class Person(name: String, personAge: Int) {

    //initialize variable immediately after being created
    //or use "laterinit" keyword to let kotlin know you will initialize the variable later
    private val fullName: String
    private var age : Int

    // initializer block is prefixed with "init"
    init {
        this.fullName = name
        this.age = personAge

        println("full name = $fullName")
        println("age = $age")
    }

}