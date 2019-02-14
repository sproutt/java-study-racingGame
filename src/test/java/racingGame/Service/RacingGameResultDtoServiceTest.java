package racingGame.Service;

import org.junit.Test;
import racingGame.model.CarDto;

import static org.junit.Assert.*;
import static racingGame.Service.CarService.makeCars;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameResultDtoServiceTest {

    @Test
    public void moreMoveCarHaveToWinTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        CarDto[] carDtos = makeCars(carNames);
        carDtos[0].move();
        carDtos[1].move();
        assertEquals("pobi, honux", GameResultService.getWinners(carDtos));
    }

    @Test
    public void getMaxNumberTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        CarDto[] carDtos = makeCars(carNames);
        carDtos[0].move();
        carDtos[0].move();
        assertEquals(2, GameResultService.getMaxNumber(carDtos));
    }

    @Test
    public void getWinnerNameTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        CarDto[] carDtos = makeCars(carNames);
        carDtos[0].move();
        assertEquals("pobi, ", GameResultService.getWinnerName(carDtos[0], 1));
    }

    @Test
    public void getWinnerNamesTest() {
        String[] carNames = {"pobi", "honux", "crong"};
        CarDto[] carDtos = makeCars(carNames);
        carDtos[0].move();
        carDtos[1].move();
        assertEquals("pobi, honux", GameResultService.getWinnerNames(carDtos, 1));
    }

}