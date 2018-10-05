package domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CarTest {

    @Test
    public void move() {
        Car car = new Car();
        car.move();

        assertThat(car.getDistance()).isEqualTo(1);
    }
}