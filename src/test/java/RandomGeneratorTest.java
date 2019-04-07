import org.junit.Test;
import util.RandomGenerator;

import static org.junit.Assert.*;

public class RandomGeneratorTest {

    @Test
    public void testRandomNumber() {
        int tmp = RandomGenerator.getRandomNumber(10);
        if (!(0 <= tmp && tmp < 10)) {
            fail();
        }
    }
}