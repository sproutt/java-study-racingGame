package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Car car;

    @Before
    public void init(){
        car = new Car();
        car.move();
    }

    @Test
    public void move() {
        assertEquals(1, car.getPosition());
    }
}