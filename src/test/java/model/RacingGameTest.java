package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RacingGameTest {

    RacingGame racingGame;

    @Before
    public void setUp() {
        racingGame = new RacingGame();
    }

    @Test
    public void noReady_PlayGame() {
        assertEquals("[]", racingGame.playGame().getWinners());
    }

    @Test
    public void ready_PlayGameTest() {
        racingGame.readyGame("one,two,three", 3);
        assertNotEquals("[]", racingGame.playGame().getWinners());
    }
}