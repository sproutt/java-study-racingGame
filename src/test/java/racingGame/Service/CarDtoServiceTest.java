package racingGame.Service;

import org.junit.Test;
import racingGame.model.CarDto;

import static org.assertj.core.api.Assertions.assertThat;


public class CarDtoServiceTest {

    private CarService carService;

    public CarDtoServiceTest(){
        carService=new CarService();
    }

    @Test
    public void makeCarsTest() {
        String[] carNames = {"a", "b", "c"};
        assertThat(carService.makeCars(carNames)[0].getName()).isEqualTo("a");
    }

    @Test
    public void moveTest() {
        CarDto carDto = new CarDto("a");
        carService.move(carDto, 1);
        carService.move(carDto, 2);
        carService.move(carDto, 3);
        carService.move(carDto, 4);
        assertThat(carDto.getPosition()).isEqualTo(1);
        carService.move(carDto, 5);
        assertThat(carDto.getPosition()).isEqualTo(2);
        carService.move(carDto, 7);
        carService.move(carDto, 8);
        assertThat(carDto.getPosition()).isEqualTo(4);
    }
}