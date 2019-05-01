import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import racinggame.model.RacingGame;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    RacingGame racingGame;

    @Before
    public void setUp() {
        racingGame = new RacingGame();
        String[] names = {"a", "b", "c"};
        racingGame.settingCar(names);
    }

    @Test
    public void 차량셋팅확인() {
        assertEquals(3, racingGame.getCars().size());
    }

    @After
    public void tearDown() {
        racingGame = null;
    }
}

