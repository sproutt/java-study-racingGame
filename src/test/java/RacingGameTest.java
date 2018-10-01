import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    private Car car;
    private RacingGameInputView inputView;
    private RacingGameOutputView outputView;
    private RacingGameController controller;

    @Before
    public void setUp() {
        car = new Car();
        controller = new RacingGameController(car, inputView, outputView);
    }


    @Test
    public void 차대수입력Test() {
        controller.setNumberOfCars(3);
        assertEquals(3, controller.getNumberOfCars());
    }

    @Test
    public void 시도횟수입력Test() {
        controller.setTrials(5);
        assertEquals(5, controller.getTrials());
    }

    @Test
    public void 랜덤숫자가4이상일때한칸이동하는지Test() {
        assertEquals(1, car.checkMoveCondition(5));
    }

    @Test
    public void 이동한칸이시도횟수를넘지않는지Test() {
        car.setCarPosition(5);
        assertEquals(true, car.getCarPosition() <= 5);
    }

    @Test
    public void 차대수만큼carList원소가추가됬는지Test() {
        controller.setNumberOfCars(3);
        controller.setTrials(5);
        controller.setCarList();
        assertEquals(3, controller.getCarList().size());
    }
}
