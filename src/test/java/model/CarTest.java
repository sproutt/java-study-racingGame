package model;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Car car = new Car();

    @Test
    public void getPosition() {
        assertEquals(car.getPosition(), 0);
    }

    @Test
    public void move() {
        car.move();
        assertEquals(car.getPosition(), 1);
    }
}