package oop.Recursion

import java.util.*
import kotlin.random.Random

fun main() {

    val text = "Kotlin programming"
    for (l in text) {
        if (l.equals(" ")) continue
        println(l)
    }

    // labeled form
    val reader = Scanner(System.`in`)
    //  There are 3 structural jump expressions in Kotlin: break, continue and return
    outerloop@ for (i in 1..5) {
        println("Enter a random number : ")
        val number = reader.nextInt()
        if (number == 7) break@outerloop
        if (number == 5)


            println("try again")
    }

}