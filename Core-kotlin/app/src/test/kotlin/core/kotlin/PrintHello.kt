package core.kotlin

import org.junit.Test

class PrintHello {
}


fun printHello(name: String?){
    if (name != null)
        println("Hello $name")


}


fun main() {
    printHello("abc")

    printHello(null)
}
