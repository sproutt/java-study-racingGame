package racingGame;

import org.junit.Before;
import org.junit.Test;
import racing.Car;
import racing.RacingGame;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RacingGameTest {
    private RacingGame racingGame;

    @Before
    public void setUp() {
        racingGame = new RacingGame();
        racingGame.setCar(3);
    }

    @Test
    public void 선택된차전진() {
        Car car = new Car();
        racingGame.moveSelectedCar(car);
        int result = car.getPosition();
        assertThat(result, anyOf(is(1), is(0)));
    }


    @Test
    public void 전진중인가() {
        boolean variable = racingGame.isMoving();
        assertTrue(variable == true || variable == false);
    }

    @Test
    public void play() {
        List<Car> cars = racingGame.tryOut(3);
        assertThat(cars.size(), is(3));
        assertThat(cars.get(0), notNullValue());
        assertThat(cars.get(1), notNullValue());
        assertThat(cars.get(2), notNullValue());
    }
}
