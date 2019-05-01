import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import racinggame.util.RandomGenerator;

import static org.junit.Assert.assertNotNull;

public class RandomGeneratorTest {
    RandomGenerator randomGenerator;

    @Before
    public void setUp() {
        randomGenerator = new RandomGenerator();
    }

    @Test
    public void 랜덤생성작동여부() {
        assertNotNull(randomGenerator.randomGenerator());
    }


    @After
    public void tearDown() {
        randomGenerator = null;
    }
}
