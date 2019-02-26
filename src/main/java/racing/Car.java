package racing;

public class Car {
    private int position;
    private String name;

    public Car() {
        position = 0;
    }

    public Car(String name) {
        position = 0;
        this.name = name;
    }

    public void move() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

}
