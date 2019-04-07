import model.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CarTest {

    Car car;

    @Before
    public void setUp(){
        car = new Car();
    }

    @Test
    public void testSubmitRecord(){
        List<Integer> record = new ArrayList<>();
        car.submitRecord(record);
        assertEquals(1, record.size());
        assertEquals(0, (int)record.remove(0));
    }

    @Test
    public void testMove(){
        List<Integer> record = new ArrayList<>();
        car.submitRecord(record);
        int position = record.get(0);
        car.move();
        car.submitRecord(record);
        assertEquals(position+1, (int)record.get(1));
    }
}