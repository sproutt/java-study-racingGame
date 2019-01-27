import org.junit.Before;
import org.junit.Test;
import racingGame.controller.RacingGameController;
import racingGame.model.Car;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    private static RacingGameController racingGame = new RacingGameController();

    @Test
    public void 랜덤숫자가져오기() {
        assertEquals(5, racingGame.getRandomNumber(), 5);
    }

}