import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import racingGame.model.RacingGame;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    RacingGame racingGame;
    private final static int MIN_MOVED = 0;
    private final static int SETTING_TRY_NUM = 5;

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

