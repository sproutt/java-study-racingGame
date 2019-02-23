package racingGame;

import org.junit.Before;
import org.junit.Test;
import racing.RacingGame;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RacingGametest {
    RacingGame racingGame;

    @Before
    public void setUp() {
        racingGame = new RacingGame();
        racingGame.setTimes(5);
        racingGame.setCarPositions(3);
    }

    @Test
    public void 이동체크() {
        // 0번 자동차가 이번 시도에서 전진한다면 초기 0에서 1증가되어 1을 반환
        assertEquals(1, racingGame.checkMove(true, 0));
    }

    @Test
    public void 전진중인가() {
        assertEquals(true, racingGame.isMoving(8));
    }


    @Test
    public void 각차량의상태() {
        boolean[] stateOfMoving = new boolean[]{true, false, true};
        int[] stateOfcar = new int[]{1, 0, 1};
        assertArrayEquals(stateOfcar, racingGame.move(stateOfMoving));
    }
}
