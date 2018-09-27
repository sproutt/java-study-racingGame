import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void setUp() {
        car = new Car();
    }

    @Test
    public void setget테스트(){
        car.setPosition(5);
        assertEquals(5,car.getPosition());
    }
}
