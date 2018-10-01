import model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car();
    }

    @Test
    public void setget테스트() {
        car.setPosition(5);
        assertEquals(5, car.getPosition());
    }
}
