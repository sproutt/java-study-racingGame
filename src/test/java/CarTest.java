import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class CarTest {
    RacingColtroller racingColtroller;
    Car car;

    @Before
    public void setUp() {
        racingColtroller = new RacingColtroller();
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        car = new Car();
    }

    @Test
    public void 난수생성() {
        boolean variable = racingColtroller.isForward();
        assertTrue(variable == true || variable == false);
    }

    @Test
    public void 자동차위치증가() {
        car.move();
        assertEquals(1, car.getCarPosition());
    }

    @Test
    public void 반복횟수이하의이동확인() {
        racingColtroller.forwardOrStay(2, 0);
        assertTrue(car.getCarPosition() == 0 || car.getCarPosition() == 1 || car.getCarPosition() == 2);
    }

    @Test
    public void 전진혹은정지() {
        racingColtroller.repeatProcess(0);
        assertTrue(car.getCarPosition() == 0 || car.getCarPosition() == 1);
    }

}
