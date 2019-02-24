package racing;

public class Car {
    private int position;

    public Car() {
        position = 0;
    }

    public int move() {
        return ++position;
    }

    public int getPosition() {
        return position;
    }
}
