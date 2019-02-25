package racing;

public class Car {
    private int position;
    private String name;

    public int move() {
        return ++position;
    }

    public int getPosition() {
        return position;
    }

    public String getName(){
        return this.name;
    }

    public Car() {
        position = 0;
    }

    public Car(String name) {
        position = 0;
        this.name = name;
    }
}
