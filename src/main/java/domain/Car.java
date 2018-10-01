package domain;

public class Car {
    private int carPosition = 0;

    public void move() {
        carPosition++;
    }

    public int getCarPosition() {
        return carPosition;
    }
}
