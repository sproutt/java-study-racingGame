import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RacingGameTest {
    Car[] car;
    Car testCar;
    RacingGame racingGame;

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
        int num = 5;
        car = racingGame.makeCar(num);
        assertEquals(5, car.length);
    }

    @Test
    public void moveCar테스트(){
        testCar = new Car();
        int count = 3;
        int position = racingGame.move(count);
        assertNotNull(position);
    }
}
