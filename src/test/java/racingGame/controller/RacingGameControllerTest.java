package racingGame.controller;

import org.junit.*;
import racingGame.Service.CarService;
import racingGame.Service.RacingGameResultService;
import racingGame.controller.RacingGameController;
import racingGame.model.Car;
import racingGame.util.RacingGameUtil;

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
        assertEquals(true, RacingGameUtil.isMove(4));
    }


}