import org.junit.*;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    Car car;
    GameController gameController;

    @Test
    public void distance값_증가_확인() {
        int distanceTest = car.getDistance();
        car.move();

        assertEquals(distanceTest, car.getDistance());
    }
}