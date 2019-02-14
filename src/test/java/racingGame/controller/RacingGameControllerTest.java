package racingGame.controller;

import org.junit.*;
import racingGame.model.CarDto;

import static org.junit.Assert.assertEquals;
import static racingGame.Service.CarService.makeCars;

public class RacingGameControllerTest {
    private RacingGameController racingGameController;
    private CarDto carDto;

    @Before
    public void beforeSetup() {
        racingGameController = new RacingGameController();
        carDto = new CarDto("pobi");
    }

    @Test
    public void carMoveTest() {
        carDto.move();
        assertEquals(1, carDto.getPosition());
    }

    @Test
    public void carMoveTestAgainTest() {
        carDto.move();
        carDto.move();
        assertEquals(2, carDto.getPosition());
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