import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RacingControllerTest {
    RacingController racingController;
    Car car;
    InputView inputView;
    ResultView resultView;

    @Before
    public void setUp() throws Exception {
        car = new Car();
        racingController = new RacingController(car, inputView, resultView);
    }

    @Test
    public void 한번의_경주() {
        assertNotNull(racingController.oneTimeMove(new int[]{1, 1, 0}));
    }

    @Test
    public void 주어진_횟수만큼의_경주() {
        racingController.setCarCarPositions(new int[]{1, 1, 0});
        assertNotNull(racingController.move());
    }

    @Test
    public void 전진의경우_1이_멈춤의경우_0이_반환돼야함() {
        int value = racingController.FowardAndStop();
        assertTrue(value == 1 || value == 0);
    }

    @Test
    public void 모델의_time변수_set과get_테스트() {
        racingController.setCarTime(5);
        assertNotNull(racingController.getCarTime());
    }

    @Test
    public void 모델의_carPosition변수_set과get_테스트() {
        racingController.setCarCarPositions(new int[]{1, 1, 0});
        assertNotNull(racingController.getCarCarPositions());
    }

    @Test
    public void 모델의_carPosition_배열이_생성돼야함() {
        racingController.makeCarCarPositions(5);
        assertNotNull(racingController.getCarCarPositions());
    }
}
