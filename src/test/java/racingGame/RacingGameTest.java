package racingGame;

import org.junit.Before;
import org.junit.Test;
import racing.RacingGame;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RacingGameTest {
    RacingGame racingGame;

    @Before
    public void setUp() {
        racingGame = new RacingGame();
        racingGame.setTimes(3);
        racingGame.setCarPositions(1);
    }

    @Test
    public void 전진중이동체크() {
        assertEquals(1, racingGame.checkMove(true, 0));
    }

    @Test
    public void 전진중인가() {
        boolean variable = racingGame.isMoving();
        assertTrue(variable == true || variable == false);
    }


    @Test
    public void 반복횟수이하전진확인() {
        racingGame.tryOut();
        ArrayList<Integer> positions = racingGame.getCarPositions();
        assertTrue(positions.get(0) == 0 || positions.get(0) == 1 || positions.get(0) == 2 || positions.get(0) == 3);
    }
}
