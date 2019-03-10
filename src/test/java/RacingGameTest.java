import RacingGame.RacingGame;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    RacingGame racingGame;
    @Before
    public void setUp() {
        racingGame = new RacingGame();
    }

    @After
    public void tearDown(){
        racingGame = null;
    }
}
