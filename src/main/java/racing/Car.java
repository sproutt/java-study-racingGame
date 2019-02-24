package racing;

public class Car {
    public final String BLOCK = "-";
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

    public void showDistance() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append(BLOCK);
        }
        System.out.println(stringBuilder.toString());
    }
}
