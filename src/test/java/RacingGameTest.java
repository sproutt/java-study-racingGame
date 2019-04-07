import model.Car;
import model.RacingGame;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RacingGameTest {

    RacingGame racingGame;

    @Before
    public void setUp(){
        racingGame = new RacingGame();
    }

    @Test
    public void test준비하지않고PlayGame(){
        List<Integer> record = racingGame.playGame();
        assertEquals(0,record.size());
    }

    @Test
    public void test준비하고PlayGame(){
        racingGame.readyGame(3,5);
        List<Integer> record = racingGame.playGame();
        assertEquals(3, record.size());
    }
}