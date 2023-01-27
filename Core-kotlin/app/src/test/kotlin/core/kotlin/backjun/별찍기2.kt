package core.kotlin.backjun

import java.util.Scanner

class 별찍기2 {

}

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()

    for (i in 0..n) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..i) {
            print("*")
        }
        println()
    }
}
