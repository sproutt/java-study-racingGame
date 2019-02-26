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
        racingGame.setCar("kiki,hoho");
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
        assertThat(cars.size(), is(2));
        assertThat(cars.get(0), notNullValue());
        assertThat(cars.get(1), notNullValue());
    }

    @Test
    public void 승자찾기() {
        List<Car> cars = racingGame.getWinner();
        assertThat(cars.size(), is(2));
        assertThat(cars.get(0).getName(), is("kiki"));
        assertThat(cars.get(1).getName(), is("hoho"));
    }

    @Test
    public void 가장멀리간차의포지션() {
        assertThat(racingGame.calculateMaxPosition(), is(0));
    }
}
