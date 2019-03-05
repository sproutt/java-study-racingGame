package racingGame.model;

import org.junit.Before;
import org.junit.Test;
import racing.model.Car;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class CarTest {
    Car car;

    @Before
    public void setup() {
        car = new Car("kiki");
    }

    @Test
    public void 차움직이기() {
        car.move();
        assertThat(car.getPosition(), is(1));
    }

    @Test
    public void 이차의이름은() {
        assertThat(car.getName(), is("kiki"));
    }

    @Test
    public void 더먼거리는() {
        car.move();
        assertThat(car.checkMax(0), is(1));
    }

    @Test
    public void 이거리가맞습니까() {
        assertThat(car.isSamePosition(0), is(true));
    }
}
