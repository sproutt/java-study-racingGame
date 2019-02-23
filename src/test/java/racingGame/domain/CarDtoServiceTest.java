package racingGame.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CarDtoServiceTest {

    private RacingGame racingGame;

    public CarDtoServiceTest(){
        racingGame =new RacingGame();
    }

    @Test
    public void makeCarsTest() {
        String[] carNames = {"a", "b", "c"};
        assertThat(racingGame.makeCars(carNames)[0].getName()).isEqualTo("a");
    }

    @Test
    public void moveTest() {
        RacingGame.CarDto carDto = new RacingGame.CarDto("a");
        racingGame.move(carDto, 1);
        racingGame.move(carDto, 2);
        racingGame.move(carDto, 3);
        racingGame.move(carDto, 4);
        assertThat(carDto.getPosition()).isEqualTo(1);
        racingGame.move(carDto, 5);
        assertThat(carDto.getPosition()).isEqualTo(2);
        racingGame.move(carDto, 7);
        racingGame.move(carDto, 8);
        assertThat(carDto.getPosition()).isEqualTo(4);
    }
}