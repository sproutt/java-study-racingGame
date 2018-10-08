import model.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void moveTest() {
        Car car = new Car("a");
        car.move();
        assertEquals(1, car.getCarPosition());
    }
}
