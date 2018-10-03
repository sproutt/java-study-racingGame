import domain.Car;
import org.junit.Before;
import org.junit.Test;
import utils.RacingGame;

import static org.junit.Assert.assertTrue;

public class RacingGameTest {
    RacingGame racingGame;
    Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
        int time = 5;
        int numberOfCars = 3;
        racingGame = new RacingGame(time, numberOfCars);
    }

    @Test
    public void 반환값이_0이상_time이하여야함() {
        int carPosition = racingGame.race();
        assertTrue(carPosition >= 0 && carPosition <= 5);
    }

    @Test
    public void 반환된_배열값이_각각_0이상_time이하여야함() {
        int[] carPositions = racingGame.startGame();
        for (int i = 0; i < carPositions.length; i++) {
            assertTrue(carPositions[i] >= 0 && carPositions[i] <= 5);
        }
    }
}
