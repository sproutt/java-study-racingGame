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
        car = new Car("pobi");
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
        String[] carNames = {"pobi", "honux"};
        assertEquals(2, racingGame.makeCars(carNames).length);
    }

    @Test
    public void HaveToGetSameNameAfterMakeCar() {
        String[] carNames = {"pobi"};
        assertEquals("pobi", racingGame.makeCars(carNames)[0].getName());
    }

    @Test
    public void isMoveReturnTest() {
        assertEquals(true, racingGame.isMove(4));
    }

    @Test
    public void haveToGetMaxNumber() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = racingGame.makeCars(carNames);
        cars[0].move();
        cars[0].move();
        assertEquals(2, racingGame.getMaxNumber(cars));
    }

    @Test
    public void getNameIfHaveMaxNumber() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = racingGame.makeCars(carNames);
        cars[0].move();
        assertEquals("pobi", racingGame.getNameIfHaveMaxNumber(cars[0], 1));
    }

    @Test
    public void getMaxNumberCarNamesString() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = racingGame.makeCars(carNames);
        cars[0].move();
        cars[1].move();
        assertEquals("pobi, honux", racingGame.getMaxNumberCarNamesString(cars, 1));
    }

    @Test
    public void moreMoveCarHaveToWin() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = racingGame.makeCars(carNames);
        cars[0].move();
        cars[1].move();
        assertEquals("pobi, honux", racingGame.getWinners(cars));
    }

}