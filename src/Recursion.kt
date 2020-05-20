// Recursive functions; a function that calls itself.
// And tail recursive function.

fun main() {
    val result = factorial(4)
    println("result = $result")
}

fun factorial(n: Int): Long {
    println("number = $n")
    return if (n == 1) n.toLong() else n * factorial(n - 1)
}