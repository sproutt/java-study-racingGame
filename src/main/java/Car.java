public class Car {
    private int carPosition = 0;

    public int getCarPosition() {
        return this.carPosition;
    }

    public int move() {
        return carPosition++;
    }
}


