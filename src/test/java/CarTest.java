import domain.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @Test
    public void move_위치변수_1증가() {
        int before = car.getCarPosition();
        car.move();
        int after = car.getCarPosition();

        assertEquals(before + 1, after);
    }
}
