import org.junit.Before;
import org.junit.Test;
import utils.RandomValueGenerator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RacingGameTest {
    private Car car;
    private RacingGameController racingGame;

    @Before
    public void setUp() {
        car = new Car();
        racingGame = new RacingGameController();
    }

    @Test
    public void 차대수만큼추가됬는지Test() {
        racingGame.setCars(3, 5);
        assertEquals(3, racingGame.getCars().size());
    }

    @Test
    public void 차이동Test() {
        car.move();
        assertEquals(1, car.getCarPosition());
    }

    @Test
    public void 랜덤숫자가boundaryNumber미만숫자가나오는지Test() {
        int random = RandomValueGenerator.makeRandomNumber(10, 0);
        assertTrue(random < 10);
    }
}
