import domain.Car;
import org.junit.Before;
import org.junit.Test;
import domain.RacingGame;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class RacingGameTest {
    RacingGame racingGame;
    Car car;
    int time;

    @Before
    public void setUp() throws Exception {
        car = new Car();
        time = 5;
        racingGame = new RacingGame(time);
    }

    @Test
    public void race_반환값이_0이상_time이하여야함() {
        racingGame.race(car);
        assertTrue(car.getCarPosition() >= 0 && car.getCarPosition() <= time);
    }

    @Test
    public void startGame_반환된_배열값이_각각_0이상_time이하여야함() {
        String nameOfCars = "pobi,crong";
        List<Car> cars = new ArrayList<Car>();
        cars = racingGame.setCars(cars, nameOfCars);
        cars = racingGame.startGame(cars);

        for (int i = 0; i < cars.size(); i++) {
            assertTrue(cars.get(i).getCarPosition() >= 0 && cars.get(i).getCarPosition() <= time);
        }
    }
}
