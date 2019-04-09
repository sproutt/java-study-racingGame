import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import racingGame.model.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void setUp() {
        car = new Car();
    }

    @Test
    public void 플레이어이름설정() {
        String[] names = {"a", "b", "c", "d"};
        car.setPlayerName(names, 1);
        assertEquals("b", car.getPlayerName());
    }

    @Test
    public void 움직임여부() {
        int beforeCarPosition = car.getCarPosition();
        car.move();
        assertEquals(beforeCarPosition + 1, car.getCarPosition());
    }

    @After
    public void tearDown() {
        car = null;
    }
}
