package racingGame.domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RacingResultTest {

    private RacingResult racingResult;
    private RacingGame racingGame;
    private RacingGame.CarDto[] carDtos;

    public RacingResultTest(){
        racingGame =new RacingGame();
    }
    @Before
    public void before(){
        String[] carNames = {"pobi", "honux", "crong"};
        carDtos = racingGame.makeCars(carNames);
        racingResult = new RacingResult(carDtos);
    }

    @Test
    public void getResultsTest() {
        racingGame.move(carDtos[0], 7);
        racingGame.move(carDtos[0], 7);

        assertThat("pobi : --\nhonux : \ncrong : \n\n").isEqualTo(racingResult.getTraces());
        assertThat("pobi").isEqualTo(racingResult.getWinners(2));
    }

    @Test
    public void getWinnersTest(){
        racingGame.move(carDtos[0], 7);
        racingGame.move(carDtos[0], 7);
        racingGame.move(carDtos[2], 4);
        racingGame.move(carDtos[1], 5);
        racingGame.move(carDtos[1], 7);
        racingGame.move(carDtos[2], 1);

        assertThat("pobi, honux").isEqualTo(racingResult.getWinners(2));

    }
    @Test
    public void getMaxNumber() {
        racingGame.move(carDtos[0], 7);
        racingGame.move(carDtos[0], 7);

        assertThat(2).isEqualTo(racingResult.getMaxNumber(carDtos));
    }

    @Test
    public void getWinnerNames() {
    }

    @Test
    public void getWinnerName() {
    }

    @Test
    public void toWinnerPrintFormat() {
    }
}