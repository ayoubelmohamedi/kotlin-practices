package oop.Recursion// Recursive functions; a function that calls itself.
// And tail recursive function.

fun main() {
    val number = 5
    val result = factorial(4)
    println("result = $result")
    println("oop.Recursion.factorial of $number = ${tailFactorial(number)}")
}

fun factorial(n: Int): Long {
    println("number = $n")
    return if (n == 1) n.toLong() else n * factorial(n - 1)
}

// Factorial Using Tail Recursion
//A recursive function is eligible for tail recursion if the function call to itself is the last operation it performs
tailrec fun tailFactorial(n: Int, run : Int = 1): Long {
    println("number = $n")
    return if (n == 1) run.toLong() else tailFactorial(n - 1, run * n)
}