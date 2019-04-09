import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import racingGame.model.RacingGame;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    RacingGame racingGame;

    @Before
    public void setUp() {
        racingGame = new RacingGame();
        String[] names = {"a","b","c"};
        racingGame.settingCar(names);
    }

    @Test
    public void 차량셋팅확인() {
        assertEquals(3, racingGame.getCars().size());
    }

    @Test
    public void 게임실행여부(){

    }

    @After
    public void tearDown() {
        racingGame = null;
    }
}

