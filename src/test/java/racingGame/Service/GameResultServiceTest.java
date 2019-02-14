package racingGame.Service;

import org.junit.Before;
import org.junit.Test;
import racingGame.model.CarDto;

import static org.assertj.core.api.Assertions.assertThat;


public class GameResultServiceTest {

    private GameResultService gameResultService;
    private CarService carService;
    private CarDto[] carDtos;

    public GameResultServiceTest(){
        carService=new CarService();
    }
    @Before
    public void before(){
        String[] carNames = {"pobi", "honux", "crong"};
        carDtos = carService.makeCars(carNames);
        gameResultService = new GameResultService(carDtos);
    }

    @Test
    public void getResultsTest() {
        carService.move(carDtos[0], 7);
        carService.move(carDtos[0], 7);

        assertThat("pobi : --\nhonux : \ncrong : \n\n").isEqualTo(gameResultService.getTraces());
        assertThat("pobi").isEqualTo(gameResultService.getWinners(2));
    }

    @Test
    public void getWinnersTest(){
        carService.move(carDtos[0], 7);
        carService.move(carDtos[0], 7);
        carService.move(carDtos[2], 4);
        carService.move(carDtos[1], 5);
        carService.move(carDtos[1], 7);
        carService.move(carDtos[2], 1);

        assertThat("pobi, honux").isEqualTo(gameResultService.getWinners(2));

    }
    @Test
    public void getMaxNumber() {
        carService.move(carDtos[0], 7);
        carService.move(carDtos[0], 7);

        assertThat(2).isEqualTo(gameResultService.getMaxNumber(carDtos));
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