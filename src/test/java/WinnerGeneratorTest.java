import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import racinggame.model.RacingGame;
import racinggame.model.WinnerGenerator;

import static org.junit.Assert.assertTrue;

public class WinnerGeneratorTest {
    WinnerGenerator winnerGenerator;
    RacingGame racingGame;
    private static final int WINNER_NOT_ZERO = 1;

    @Before
    public void setUp() {
        winnerGenerator = new WinnerGenerator();
        racingGame = new RacingGame();
        String[] names = {"a", "b", "c", "d", "e"};
        racingGame.settingCar(names);
    }

    @Test
    public void 우승자선발여부() {
        boolean isWinnerNotZero = false;
        if (winnerGenerator.makeWinners(racingGame.tryAllCarGame(5)).size() >= WINNER_NOT_ZERO) {
            isWinnerNotZero = true;
        }
        assertTrue(isWinnerNotZero);
    }

    @After
    public void tearDown() {
        winnerGenerator = null;
        racingGame = null;
    }
}
