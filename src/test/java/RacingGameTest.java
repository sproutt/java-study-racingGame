import domain.Car;
import org.junit.Before;
import org.junit.Test;
import domain.RacingGame;

import static org.junit.Assert.assertTrue;

public class RacingGameTest {
    RacingGame racingGame;
    Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
        int time = 5;
        racingGame = new RacingGame(time);
    }

    @Test
    public void race_반환값이_0이상_time이하여야함() {
        racingGame.race(car);
        assertTrue(car.getCarPosition() >= 0 && car.getCarPosition() <= 5);
    }

    @Test
    public void startGame_반환된_배열값이_각각_0이상_time이하여야함() {
        Car[] cars = new Car[2];
        cars = racingGame.setCars(cars, "pobi,crong");
        cars = racingGame.startGame(cars);
        for (int i = 0; i < cars.length; i++) {
            assertTrue(cars[i].getCarPosition() >= 0 && cars[i].getCarPosition() <= 5);
        }
    }
}
