package core.kotlin.this_coding_test.ch1

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.lang.Math.max
import java.lang.Math.min

class `1이될때까지`() {

    fun solution(arrayOf: Array<IntArray>): Int {

        var result = 0;
        for (i in 0 until arrayOf.size step (1)) {
            var minValue = Int.MAX_VALUE

            for (j in 0 until arrayOf[i].size step (1)) {
                minValue = min(minValue, arrayOf[i][j])
            }
            result = max(result, minValue)
        }

        return result;
    }

    @Test
    fun result() {
        assertThat(solution(arrayOf(
            intArrayOf(3, 1, 2),
            intArrayOf(4, 1, 4),
            intArrayOf(2, 2, 2))
        )).isEqualTo(2);

        assertThat(solution(arrayOf(
            intArrayOf(7, 3, 1, 8),
            intArrayOf(3, 3, 3, 4))
        )).isEqualTo(3);
    }
}
