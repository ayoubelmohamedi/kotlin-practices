
fun main() {

    val text = "Kotlin programming"
    for (l in text) {
        if (l.equals(" ")) continue
        println(l)
    }

}