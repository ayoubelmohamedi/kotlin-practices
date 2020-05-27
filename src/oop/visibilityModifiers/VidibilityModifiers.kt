package oop.visibilityModifiers

//public :   declarations are visible everywhere
//private : visible inside the file containing the declaration
//internal : visible inside the same module (a set of Kotlin files compiled together)
//protected : not available for packages (used for subclasses)

//Note : if visibility modifier is not specified, it is public by default. same as java

fun function1() {}   // public by default and visible everywhere

private fun function2() {}   // visible inside this file

internal fun function3() {}   // visible inside the same module

var name = "Foo"   // visible everywhere
    get() = field   // visible everywhere (same as its property)
    private set(value) {   // visible inside this file (VisibilityModifiers.kt)
        field = value
    }

private class classA {}   // visible inside this file only.