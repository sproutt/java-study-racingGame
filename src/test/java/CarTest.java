import model.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CarTest {

    Car car;

    @Before
    public void setUp() {
        car = new Car();
    }

    @Test
    public void testShowTrack() {
        assertEquals("", car.showTrack('-'));
    }

    @Test
    public void testShowTrackAfterMove() {
        car.move();
        assertEquals("-", car.showTrack('-'));
    }
}