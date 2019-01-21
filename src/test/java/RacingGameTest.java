import com.econo.racingGame.model.Car;
import com.econo.racingGame.controller.RacingGame;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RacingGameTest {

    private RacingGame racingGame;
    private Car car;

    @Before
    public void setUp() throws Exception {
        racingGame = new RacingGame();

    }

    @Test
    public void checkRandomNumberTest() {
        assertEquals(1, racingGame.checkRandomNumber(4));
    }

    @Test
    public void returnDistance() {
        assertEquals(true, isDistanceEquals(5,racingGame.returnDistance(5)));
    }

    @Test
    public void makeCarsTest() {
        assertEquals(true, isCarnumberEquals(3,racingGame.makeCars(3,5)));
    }

    public boolean isDistanceEquals(int tryNumber, int distance){
        if(tryNumber>=distance){
            return true;
        }
        return false;
    }

    public boolean isCarnumberEquals(int carNumber, Car[] cars){
        if(cars.length==carNumber){
            return true;
        }
        return false;
    }

}