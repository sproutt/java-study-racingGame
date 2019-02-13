package racingGame.Service;

import org.junit.Test;
import racingGame.model.Car;

import static org.assertj.core.api.Assertions.assertThat;


public class CarServiceTest {

    @Test
    public void makeCarsTest() {
        String[] carNames = {"a", "b", "c"};
        assertThat(CarService.makeCars(carNames)[0].getName()).isEqualTo("a");
    }

    @Test
    public void moveTest() {
        Car car = new Car("a");
        CarService.move(car, 1);
        CarService.move(car, 2);
        CarService.move(car, 3);
        CarService.move(car, 4);
        assertThat(car.getPosition()).isEqualTo(1);
        CarService.move(car, 5);
        assertThat(car.getPosition()).isEqualTo(2);
        CarService.move(car, 7);
        CarService.move(car, 8);
        assertThat(car.getPosition()).isEqualTo(4);
    }
}