package racingGameTest;

import org.junit.Before;
import org.junit.Test;
import racingGame.Car;
import racingGame.RacingGameApplication;
import racingGame.RacingGameController;
import racingGame.RacingGameView;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    Car model = new Car();
    RacingGameView view = new RacingGameView();
    RacingGameController controller = new RacingGameController(model, view);
    RacingGameApplication application = new RacingGameApplication();

    @Before
    public void setUp() {
        model = new Car();
        view = new RacingGameView();
        controller = new RacingGameController(model, view);
        application = new RacingGameApplication();
    }

    @Test
    public void 차_대수입력Test() {
        model.setCars(3);
        assertEquals(3, model.getCars().size());
    }

    @Test
    public void 시도횟수입력Test() {
        model.setTrials(5);
        assertEquals(5, model.getTrials());
    }

    @Test
    public void 난수생성Test() {
        assertEquals(true, model.makeRandomNumber() < 10 && model.makeRandomNumber() > 0);
    }

    @Test
    public void 전진조건Test() {
        assertEquals(1, model.checkMoveCondition(5));
    }

    @Test
    public void 전진Test() {
        model.setTrials(5);
        assertEquals(true, model.adaptMoveCondition() < 5);
    }

    @Test
    public void 모든차_전진입력Test() {
        model.setCars(3);
        assertEquals(3, model.moveCars().size());
    }




}
