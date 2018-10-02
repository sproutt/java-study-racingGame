package domain;

public class Car {

    private int distance;

    public int getDistance() {
        return distance;
    }

    public int move() {
        return this.distance++;
    }
}
