package core.kotlin.this_coding_test.ch1

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

 /**
 * ## 반성
 * - 코틀린은 매개변수가 변경 할 수 없는 언어다.
 *  see also
 *  [Parameters는 Immutable하다](https://blog.jetbrains.com/kotlin/2013/02/kotlin-m5-1/)
 */

class 거스름돈() {

    fun solution(n: Int): Int {
        var money = n;
        var count = 0;

        var coin_type = listOf(500, 100, 500, 10)

        for (coin in coin_type) {
            count += money / coin
            money %= coin
        }

        return count;
    }

    @Test
    fun result() {
        assertThat(solution(1260)).isEqualTo(10);
    }
}
