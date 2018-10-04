import domain.Car;
import domain.RacingGame;
import dto.RacingResult;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RacingResultTest {
    RacingGame racingGame;
    Car[] cars;
    RacingResult racingResult;
    int time = 5;

    @Before
    public void setUp() throws Exception {
        racingGame = new RacingGame(time);
        cars = new Car[2];
        cars = racingGame.setCars(cars, "pobi,crong");
        cars = racingGame.startGame(cars);
        racingResult = new RacingResult();
        racingResult.updateResult(cars);
    }

    @Test
    public void searchMaxCarPosition_최대값은_0이상_time_이하여야함() {
        int maxCarPosition = racingResult.searchMaxCarPosition();
        assertTrue(maxCarPosition >= 0 && maxCarPosition <= time);
    }

    @Test
    public void checkWinners_우승한_차는_1대이상() {
        LinkedList<String> winnerList = racingResult.checkWinners(racingResult.searchMaxCarPosition());
        assertTrue(winnerList.size() >= 1);
    }

    @Test
    public void getWinnersTest() {
        assertNotNull(racingResult.getWinners());
    }
}
