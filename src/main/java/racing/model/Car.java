package racing.model;

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

    public int checkWinner(int anyPosition) {
        return Math.max(anyPosition, this.position);
    }

    public boolean isSamePosition(int anyPosition) {
        return this.position == anyPosition;
    }
}
