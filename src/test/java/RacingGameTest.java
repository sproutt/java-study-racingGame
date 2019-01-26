import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RacingGameTest extends RacingGame {
    private static RacingGame racingGame = new RacingGame();

    @Before
    public void init() {
        racingGame.setCars(3);
        racingGame.setTrys(12);
        racingGame.initCarPisitions();
    }

    //    @Test
//    public void moveTest() {
//        int[] input = {0,0,0};
//        int[] result = {1,1,1};
//        //assertEquals(result, racingGame.moveAll());
//    }
    @Test
    public void 랜덤숫자가져오기() {
        assertEquals(5, racingGame.getRandomNumber(), 5);
    }

//    @Test
//    public void 자동차움직임테스트(){
//        assertTrue(racingGame.tryMove() instanceof boolean)
//    }

}