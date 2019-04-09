import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import racingGame.model.Car;

public class CarTest {
    Car car;

    @Before
    public void setUp() {
        car = new Car();
    }

    @Test
    public void 움직임작동여부() {

    }

    @After
    public void tearDown() {
        car = null;
    }
}
