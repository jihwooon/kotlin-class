package core.kotlin.basic_syntax

class StringTemplates {

}

fun maxOf(a : Int, b : Int) : Int {
    if(a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf_another(a : Int, b : Int) : Int = if(a > b) a else b


fun main() {
    var a = 1
    var s1 = "a is $a"

    a = 2

    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    println("max of 0 and 42 is ${maxOf(0, 42)}")
    println("max of 0 and 42 is ${maxOf_another(0, 42)}")
}
