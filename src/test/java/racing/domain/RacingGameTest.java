package racing.domain;

import racing.Car;
import racing.RacingGame;
import racing.dto.RacingGameResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void setup() {
        racingGame = new RacingGame();
    }

    @Test
    public void playGameTest() {
        racingGame.setCars("pobi");
        RacingGameResult result = racingGame.play(5);

        assertThat(result).isNotNull();
    }

    @Test
    public void setCarsTest() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("hyukjin"));
        cars.add(new Car("hwajoong"));
        cars.add(new Car("changhwan"));

        racingGame.setCars("hyukjin,hwajoong,changhwan");

        assertThat(racingGame.toString()).isEqualTo(cars.toString());
    }

    @Test
    public void moveSelectedCarTest() {
        Car car = new Car("hyukjin");
        racingGame.moveSelectedCar(car, 5);

        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    public void isMoveConditionTest(){
        assertThat(racingGame.isMoveCondition(5)).isTrue();
    }

}
