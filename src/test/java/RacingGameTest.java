import org.junit.*;
import racingGame.controller.RacingGameController;
import racingGame.model.Car;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    private RacingGameController racingGame;
    private Car car;

    @Before
    public void beforeSetup() {
        racingGame = new RacingGameController();
        car = new Car();
    }

    @Test
    public void carMoveTest() {
        car.move();
        assertEquals(1, car.getPosition());
    }

    @Test
    public void carMoveTestAgain() {
        car.move();
        car.move();
        assertEquals(2, car.getPosition());
    }

    @Test
    public void HaveToGetSameLengthAfterMakeCars() {
        assertEquals(5, racingGame.makeCars(5).length);
    }

    @Test
    public void isMoveReturnTest() {
        assertEquals(true, racingGame.isMove(4));
    }

}