package racing.dto;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameResultTest {

    private RacingGameResult racingGameResult;

    @Before
    public void setUp() {
        List<CarDTO> cars = new ArrayList<>();
        cars.add(new CarDTO("hyukjin2",4));
        cars.add(new CarDTO("hyukjin",5));

        racingGameResult = new RacingGameResult(cars);
    }

    @Test
    public void getWinnersNameTest() {
        assertThat(racingGameResult.getWinnersName().toString()).isEqualTo("[hyukjin]");
    }
}
