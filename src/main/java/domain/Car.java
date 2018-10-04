package domain;

public class Car {
    private int carPosition = 0;
    private String name;

    public void move() {
        carPosition++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarPosition() {
        return carPosition;
    }
    public String getName() { return name; }
}
