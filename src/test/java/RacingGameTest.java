import org.junit.*;

public class RacingGameTest {

    Car car = new Car(5);

    @Test
    public void distanceTest() {
        Assert.assertEquals(0, car.distance);
    }

    @Test
    public void isWonTest() {
        car.Move(car.isWon());
        if(car.isWon()) {
            Assert.assertEquals(1, car.distance);
        }
        Assert.assertEquals(0, car.distance);
    }
}