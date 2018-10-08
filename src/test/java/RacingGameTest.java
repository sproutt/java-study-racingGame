import model.RacingGame;
import model.Car;
import org.junit.Before;
import org.junit.Test;
import utils.RandomValueGenerator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RacingGameTest {
    private RacingGame racingGame;

    @Before
    public void setUp() {
        racingGame = new RacingGame();
        racingGame.setCars("a,b,c");
    }

    @Test
    public void setCarsTest() {
        assertEquals(3, racingGame.getCars().size());
    }

    @Test
    public void makeWinnerStringTest() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("a", 2));
        cars.add(new Car("b", 2));
        cars.add(new Car("a", 1));

        assertEquals("a, b", racingGame.makeWinnersString(cars));
    }
}
