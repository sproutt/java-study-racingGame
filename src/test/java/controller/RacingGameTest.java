package controller;

import domain.RacingGame;
import dto.RacingGameResult;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void setup() {
        racingGame = new RacingGame();
    }

    @Test
    public void playGame() {
        racingGame.setCars(3);
        RacingGameResult result = racingGame.play(5);

        assertThat(result).isNotNull();
    }
}
