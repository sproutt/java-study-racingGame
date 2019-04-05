import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RacingCarTest {
    RacingCar racingCar;

    @Before
    public void setUp() {
        racingCar = new RacingCar(3, 5);
    }

    @Test
    public void testRandomNumber() {
        int number = racingCar.getRandomNumber(10);

        if (!(0 <= number && number < 10)) {
            fail("랜덤 수 범위에 맞지 않습니다.");
        }
    }

    @Test
    public void testCanMove() {
        assertTrue(racingCar.canMove(7));
        assertFalse(racingCar.canMove(2));
    }
}