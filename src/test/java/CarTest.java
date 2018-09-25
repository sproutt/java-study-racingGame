import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class CarTest {
    Car car;
    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @Test
    public void time변수_set과get_테스트() {
        car.setTime(5);
        assertNotNull(car.getTime());
    }

    @Test
    public void carPositions변수_set과get_테스트() {
        car.setCarPositions(new int[]{1, 1, 0});
        assertNotNull(car.getCarPositions());
    }

    @Test
    public void carPosition변수_배열이_생성돼야함() {
        car.makeCarPositions(5);
        assertNotNull(car.getCarPositions());
    }
}
