package racingGame.model;

public class Car {
    private int carPosition = 0;

    public int getCarPosition() {
        return carPosition;
    }

    public int carMove() {
        carPosition++;
        return carPosition;
    }
}