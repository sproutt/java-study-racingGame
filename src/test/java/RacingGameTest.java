import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RacingGameTest {

    RacingGame racingGame;
    RacingGameTools racingGameTools;

    @Before
    public void setUp() throws Exception {
        racingGame = new RacingGame();
        racingGameTools = new RacingGameTools();
        racingGameTools.carPositions = new int[3];
        racingGameTools.tryNumber = 5;
    }

    @Test
    public void IndividualResultTest() {
        assertEquals(true,isUpperBound(racingGame.individualResult(racingGameTools),racingGameTools.tryNumber));
    }

    @Test
    public void ResultBoundaryTest() {
        assertEquals(true,checkBound(racingGame.makeResult(racingGameTools)));
    }

    public boolean checkBound(RacingGameTools racingGameTools){
        boolean result = true;
        for(int i = 0;i<racingGameTools.carPositions.length;i++){
            result = changeResult(result,racingGameTools.carPositions[i],racingGameTools.tryNumber);
        }
        return result;
    }

    public boolean changeResult(boolean result,int carPosition, int tryNumber){
        if(result==false){
            return false;
        }
        return isUpperBound(carPosition,tryNumber);
    }

    public boolean isUpperBound(int carPosition, int tryNumber){
        if(carPosition>tryNumber){
            return false;
        }
        return true;
    }


}

