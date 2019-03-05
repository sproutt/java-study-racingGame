package racingGame.utils;

import org.junit.Test;
import racing.utils.RandomGenerator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class RandomGeneratorTest {
    @Test
    public void 숫자생성(){
        assertThat(RandomGenerator.generateNumber(),is(notNullValue()));
    }

}
