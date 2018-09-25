package model;

import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game;

    @Before
    public void init(){
        game = new Game();
        game.setNumberOfCars(2);
        game.setTime(2);
    }

    @Test
    public void runTrue() {
        int count = 0;
        for(Car car : game.getCars()){
            count++;
        }

        assertEquals(2, count);
    }

}