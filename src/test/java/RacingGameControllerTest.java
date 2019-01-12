import com.econo.racingGame.model.GameDB;
import com.econo.racingGame.controller.RacingGameController;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RacingGameControllerTest {

    private RacingGameController racingGameController;
    private GameDB gameDB;

    @Before
    public void setUp() throws Exception {
        racingGameController = new RacingGameController();
        gameDB = new GameDB();
        gameDB.makeCarPositions(3);
        gameDB.setTryNumber(5);
    }

    @Test
    public void IndividualResultTest() {
        assertEquals(true, isUpperBound(racingGameController.makeIndividualResult(gameDB), gameDB.getTryNumber()));
    }

    @Test
    public void ResultBoundaryTest() {
        assertEquals(true, checkBound(racingGameController.makeResult(gameDB)));
    }

    public boolean checkBound(GameDB gameDB) {
        boolean result = true;
        for (int i = 0; i < gameDB.getCarPositions().length; i++) {
            result = changeResult(result, gameDB.getCarPositions()[i], gameDB.getTryNumber());
        }
        return result;
    }

    public boolean changeResult(boolean result, int carPosition, int tryNumber) {
        if (result == false) {
            return false;
        }
        return isUpperBound(carPosition, tryNumber);
    }

    public boolean isUpperBound(int carPosition, int tryNumber) {
        if (carPosition > tryNumber) {
            return false;
        }
        return true;
    }

}