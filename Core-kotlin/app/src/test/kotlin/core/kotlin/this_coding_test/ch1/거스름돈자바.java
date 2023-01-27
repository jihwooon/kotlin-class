package core.kotlin.this_coding_test.ch1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 거스름돈자바 {

    public int solution(int n) {
        int count = 0;

        int[] coin_type = {500, 100, 50, 10};

        for(int coin : coin_type) {
            count += n/ coin;
            n %= coin;
        }
        return count;
    }


    @Test
    public void result() {
        assertThat(solution(1260)).isEqualTo(6);
    }

}
