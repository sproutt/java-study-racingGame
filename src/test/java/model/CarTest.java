package model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CarTest {

    Car car;

    @Before
    public void setUp() {
        car = new Car("test");
    }

    @Test
    public void showRecordTest() {
        Car tmpCar = new Car("recordTest");
        tmpCar.move();
        assertEquals("recordTest : -", tmpCar.showRecord('-', " : "));
        assertEquals("recordTest : >", tmpCar.showRecord('>', " : "));
        assertEquals("recordTest ^ -", tmpCar.showRecord('-', " ^ "));
    }

    @Test
    public void moveTest() {
        String beforeMove = car.showRecord('-', " : ");
        car.move();
        assertEquals(beforeMove + "-", car.showRecord('-', " : "));
    }

    @Test
    public void checkTopRecordTest() {
        assertEquals(100, car.checkTopRecord(100));
        assertEquals(0, car.checkTopRecord(-1));
    }

    @Test
    public void addWinnerTest() {
        int topRecord = car.checkTopRecord(-1);
        List<String> winners = new ArrayList<>();
        car.addWinner(winners, topRecord);
        assertEquals("test", winners.get(0));
    }
}