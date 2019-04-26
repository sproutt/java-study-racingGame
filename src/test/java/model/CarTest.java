package model;

import org.junit.Before;
import org.junit.Test;

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
        int topRecord = car.checkTopRecord(-1);
        assertEquals(100, car.checkTopRecord(100));
        assertEquals(topRecord, car.checkTopRecord(-2));
    }

    @Test
    public void getWinnerNameTest() {
        int topRecord = car.checkTopRecord(-1);
        assertEquals("test", car.getWinnerName(topRecord));
        assertNull(car.getWinnerName(-1));
    }
}