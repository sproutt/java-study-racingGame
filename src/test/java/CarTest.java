import static junit.framework.TestCase.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
    RacingColtroller racingColtroller;

    @Before
    public void setUp() {
        racingColtroller = new RacingColtroller();
    }

    @Test
    public void 난수생성() {
        int variable = racingColtroller.forwardOrStay();
        assertTrue(variable == 1 || variable == 0);
    }

    @Test
    public void 전체이동수() {
        int variable = racingColtroller.totalMove(3);
        assertTrue(variable >= 0 && variable <= 3);
    }

}
