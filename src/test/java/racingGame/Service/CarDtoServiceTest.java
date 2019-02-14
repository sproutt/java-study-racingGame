package racingGame.Service;

import org.junit.Test;
import racingGame.model.CarDto;

import static org.assertj.core.api.Assertions.assertThat;


public class CarDtoServiceTest {

    @Test
    public void makeCarsTest() {
        String[] carNames = {"a", "b", "c"};
        assertThat(CarService.makeCars(carNames)[0].getName()).isEqualTo("a");
    }

    @Test
    public void moveTest() {
        CarDto carDto = new CarDto("a");
        CarService.move(carDto, 1);
        CarService.move(carDto, 2);
        CarService.move(carDto, 3);
        CarService.move(carDto, 4);
        assertThat(carDto.getPosition()).isEqualTo(1);
        CarService.move(carDto, 5);
        assertThat(carDto.getPosition()).isEqualTo(2);
        CarService.move(carDto, 7);
        CarService.move(carDto, 8);
        assertThat(carDto.getPosition()).isEqualTo(4);
    }
}