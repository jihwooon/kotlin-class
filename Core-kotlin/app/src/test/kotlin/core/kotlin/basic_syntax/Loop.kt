package core.kotlin.basic_syntax

import java.util.*

class Loop() {

}


fun main() {
    // foreach
    val items = listOf("apple", "banana", "kiwifruit")

    for (item in items) {
        println(item)
    }

    // foreach
    val fruit = listOf("apple", "banana", "kiwifruit")

    for (apple in fruit.indices) {
        println("apple at $apple is ${fruit[apple]}")
    }

    for (i in 1..3) {
        println("To $i")
    }

    for (i in 6 downTo 0 step 2) {
        println("From $i")
    }

    val array = arrayOf("a", "b", "c")
    for (i in array.indices) {
        println("${array[i]}")
    }

    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }

}
