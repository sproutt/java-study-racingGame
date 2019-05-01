package javajigi_racinggame.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import racinggame.javajigi_racingGame.dto.CarDto;

public class CarDtoTest {
    @Test
    public void createStatus() {
        CarDto car = new CarDto("pobi", 3);
        assertThat(car.createStatus()).isEqualTo("---");
    }
}