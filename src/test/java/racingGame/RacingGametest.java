package racingGame;

import org.junit.Before;
import org.junit.Test;
import racing.RacingGame;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RacingGametest {
    RacingGame racingGame;

    @Before
    public void setUp(){
        racingGame = new RacingGame();
    }

    @Test
    public void 전진세기(){
        boolean[] elemnts = new boolean[]{true,false,true,true,false};
        assertEquals(3,racingGame.countMove(elemnts));
    }

    @Test
    public void 전진증가(){
        assertEquals(2,racingGame.moveCheck(true,1));
    }

    @Test
    public void 차량초기화(){
        int[] elements = new int[]{0,0,0};
        assertArrayEquals(elements,racingGame.setCarPositions(3));
    }

}
