package racingGame.Service;

import org.junit.Test;
import racingGame.model.Car;

import static org.junit.Assert.*;
import static racingGame.Service.CarService.makeCars;

public class RacingGameResultServiceTest {

    @Test
    public void moreMoveCarHaveToWinTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = makeCars(carNames);
        cars[0].move();
        cars[1].move();
        assertEquals("pobi, honux", RacingGameResultService.getWinners(cars));
    }

    @Test
    public void getMaxNumberTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = makeCars(carNames);
        cars[0].move();
        cars[0].move();
        assertEquals(2, RacingGameResultService.getMaxNumber(cars));
    }

    @Test
    public void getWinnerNameTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = makeCars(carNames);
        cars[0].move();
        assertEquals("pobi, ", RacingGameResultService.getWinnerName(cars[0], 1));
    }

    @Test
    public void getWinnerNamesTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        Car[] cars = makeCars(carNames);
        cars[0].move();
        cars[1].move();
        assertEquals("pobi, honux", RacingGameResultService.getWinnerNames(cars, 1));
    }

}