import org.junit.*;
import racingGame.controller.RacingGame;
import racingGame.model.Car;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    private RacingGame racingGame;
    private Car car;

    @Before
    public void beforeSetup() {
        racingGame = new RacingGame();
        car = new Car("pobi");
    }

    @Test
    public void carMoveTest() {
        car.move();
        assertEquals(1, car.getPosition());
    }

    @Test
    public void carMoveTestAgainTest() {
        car.move();
        car.move();
        assertEquals(2, car.getPosition());
    }

    @Test
    public void HaveToGetSameLengthAfterMakeCarsTest() {
        String[] carNames = {"pobi", "honux"};
        assertEquals(2, racingGame.makeCars(carNames).length);
    }

    @Test
    public void HaveToGetSameNameAfterMakeCarTest() {
        String[] carNames = {"pobi"};
        assertEquals("pobi", racingGame.makeCars(carNames)[0].getName());
    }

    @Test
    public void isMoveReturnTest() {
        assertEquals(true, racingGame.isMove(4));
    }

    @Test
    public void haveToGetMaxNumberTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = racingGame.makeCars(carNames);
        cars[0].move();
        cars[0].move();
        assertEquals(2, racingGame.getMaxNumber(cars));
    }

    @Test
    public void getNameIfHaveMaxNumberTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = racingGame.makeCars(carNames);
        cars[0].move();
        assertEquals("pobi, ", racingGame.getWinnerName(cars[0], 1));
    }

    @Test
    public void getMaxNumberCarNamesStringTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = racingGame.makeCars(carNames);
        cars[0].move();
        cars[1].move();
        assertEquals("pobi, honux", racingGame.getWinnerNames(cars, 1));
    }

    @Test
    public void moreMoveCarHaveToWinTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = racingGame.makeCars(carNames);
        cars[0].move();
        cars[1].move();
        assertEquals("pobi, honux", racingGame.findWinners(cars));
    }

}