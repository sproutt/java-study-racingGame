import org.junit.*;
import racingGame.Service.CarService;
import racingGame.controller.RacingGameController;
import racingGame.model.Car;

import static org.junit.Assert.assertEquals;
import static racingGame.Service.CarService.makeCars;

public class RacingGameControllerTest {
    private RacingGameController racingGameController;
    private Car car;

    @Before
    public void beforeSetup() {
        racingGameController = new RacingGameController();
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
        assertEquals(2, makeCars(carNames).length);
    }

    @Test
    public void HaveToGetSameNameAfterMakeCarTest() {
        String[] carNames = {"pobi"};
        assertEquals("pobi", makeCars(carNames)[0].getName());
    }

    @Test
    public void isMoveReturnTest() {
        assertEquals(true, racingGameController.isMove(4));
    }

    @Test
    public void haveToGetMaxNumberTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = makeCars(carNames);
        cars[0].move();
        cars[0].move();
        assertEquals(2, racingGameController.getMaxNumber(cars));
    }

    @Test
    public void getNameIfHaveMaxNumberTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = makeCars(carNames);
        cars[0].move();
        assertEquals("pobi, ", racingGameController.getWinnerName(cars[0], 1));
    }

    @Test
    public void getMaxNumberCarNamesStringTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = makeCars(carNames);
        cars[0].move();
        cars[1].move();
        assertEquals("pobi, honux", racingGameController.getWinnerNames(cars, 1));
    }

    @Test
    public void moreMoveCarHaveToWinTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = makeCars(carNames);
        cars[0].move();
        cars[1].move();
        assertEquals("pobi, honux", CarService.findWinners(cars));
    }

}