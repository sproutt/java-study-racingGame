package domain;

public class Car {
    private String name;
    private int carPosition = 0;

    public void move() {
        carPosition++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCarPosition() {
        return carPosition;
    }
}
