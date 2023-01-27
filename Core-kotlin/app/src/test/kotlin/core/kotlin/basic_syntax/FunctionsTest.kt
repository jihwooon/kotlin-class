package core.kotlin.basic_syntax

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FunctionsTest {

    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    fun sum_inferred(a: Int, b: Int) = a + b;

    @Test
    fun `It return type`() {
        assertThat(sum(1, 2)).isEqualTo(3);
        assertThat(sum(3, 4)).isEqualTo(7);
    }

    @Test
    fun `It return type is inferred`() {
        assertThat(sum_inferred(1, 2)).isEqualTo(3);
        assertThat(sum_inferred(3, 4)).isEqualTo(7);
    }
}

fun printSum(a : Int, b : Int) {
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    printSum(-1,8)
}
