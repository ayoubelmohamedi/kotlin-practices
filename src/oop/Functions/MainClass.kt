package oop.Functions

fun main() {
    //val a = 5 || val a : Int ,and then i can intialize the variable later
    val str: Byte = 6
    val decision = true;
    println("hello ayou__B $str")
    println(decision)

    //-----------------

    var myArray: Array<String> = arrayOf("Ayoub", "Karim", "Said")
    println(myArray.get(1))

    printMyName("Hassan")
    var result = "Karim" in myArray
    println(result)

    var value = if (result) "result is true" else "result is false"
    println(value)

    while (true) {
        val a = 5
        val b = 7
        println("enter operation + or -")
        //we use "when" instead of "switch"
        val enteredValue = when (val operation = readLine()) {
            "+", "sum" -> a + b
            "-", "sub" -> a - b
            else -> "$operation isn't supported !"
        }
        println("result is : $enteredValue")

        val arr: Array<Int> = arrayOf(5, 6, 18, 7)
        for (i in arr)
            println("number is : ${i * 2}")

        for (j in 1..5)
            println("second loop : $j")
        for (s in 4 downTo 2)
            println("s = $s")
        val givenStep: Int = 2
        for (o in 2..12 step givenStep)
            println("value of (o) with step of $givenStep is = $o")

        //for (i in 5 downTo 2 step 2)
    }

}

fun printMyName(name: String) {
    println("my name is $name")
}