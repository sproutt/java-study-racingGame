package racing.domain;

import racing.dto.CarDTO;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CarTest {

    private Car car;

    @Before
    public void setUp() {
        car = new Car("javajigi");
    }

    @Test
    public void moveTest() {
        car.move();
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    public void toCarDTOTest(){
        car.move(); // distance + 1
        assertThat(car.toCarDTO().toString()).isEqualTo(new CarDTO("javajigi", 1).toString());
    }
}