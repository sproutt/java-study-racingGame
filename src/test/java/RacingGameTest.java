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
        List<Car> tmpCar = racingGame.playGame();
        assertEquals(0,tmpCar.size());
    }

    @Test
    public void test준비하고PlayGame(){
        racingGame.readyGame(3,5);
        List<Car> tmpCar = racingGame.playGame();
        assertEquals(3, tmpCar.size());
    }
}