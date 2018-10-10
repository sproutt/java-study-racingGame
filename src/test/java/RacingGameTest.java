import model.RacingGame;
import model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RacingGameTest {
    private Car[] car;
    private Car testCar;
    private RacingGame racingGame;

    @BeforeEach
    public void setUp() {
        racingGame = new RacingGame();
    }

    @Test
    public void 경계값보다작은난수일경우0리턴하는지() {
        int go = 2;
        assertEquals(0, racingGame.judgeMovement());
    }

    @Test
    public void makeCar테스트() {
        car = racingGame.makeCar("pobi,crong,honux");
        assertEquals(3, car.length);
    }

    @Test
    public void moveCar테스트() {
        testCar = new Car();
        int count = 3;
        int position = racingGame.moveCar(count);
        assertNotNull(position);
    }

    @Test
    public void winnerTest() {
        car = new Car[2];
        car[0] = new Car();
        car[1] = new Car();
        car[0].setRacer("car1");
        car[0].setPosition(2);
        car[1].setRacer("car2");
        car[1].setPosition(3);
        assertEquals(3, racingGame.getWinnersPosition(car));
    }


}