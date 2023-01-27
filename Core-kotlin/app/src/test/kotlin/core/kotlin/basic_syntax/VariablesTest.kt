package core.kotlin.basic_syntax

class VariablesTest {

}

fun main() {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment

    println("a = $a, b = $b, c = $c")

    var x = 5 // `Int` type is inferred
    x += 1
    println("x = $x")

    val PI = 3.14
    var y = 0

    fun incrementX() {
        y += 1
    }

    println("x = $y; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $y; PI = $PI")
}
