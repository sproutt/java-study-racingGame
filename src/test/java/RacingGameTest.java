
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RacingGameTest {

    RacingGame racingGame;

    @Before
    public void setUp() throws Exception {
        racingGame = new RacingGame();
        racingGame.setCarNumber(3);
        racingGame.setTryNumber(5);
    }

    @Test
    public void goOrStopTest() {
        assertEquals(0, racingGame.goOrStop(3));
    }

    @Test
    public void getRandomNumberTest() {
        assertEquals(true, checkNumber(racingGame.getRandomNumber(), 10));
    }

    @Test
    public void makeIndividualPositionTest() {
        assertEquals(true, checkNumber(racingGame.makeIndividualPosition(), 6));
    }

    @Test
    public void makePositionStringTest() {
        assertEquals("----", racingGame.makePositionString(4));
    }


    public boolean checkNumber(int number, int boundary) {
        if (number < boundary) {
            return true;
        }
        return false;
    }

}

