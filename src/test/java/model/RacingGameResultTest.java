package model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class RacingGameResultTest {

    RacingGameResult racingGameResult;

    @Before
    public void setUp(){
        List<Car> cars = new LinkedList<>();
        Car winner = new Car("winner");
        Car loser = new Car("loser");
        winner.move(); winner.move(); loser.move();
        cars.add(winner); cars.add(loser);
        racingGameResult = new RacingGameResult(cars);
    }

    @Test
    public void getWinnersTest(){
        assertEquals("[winner]", racingGameResult.getWinners());
    }

    @Test
    public void showRecordsTest(){
        List<String> record = racingGameResult.showRecords('-'," : ");
       assertEquals("winner : --", record.get(0));
       assertEquals("loser : -", record.get(1));
    }
}