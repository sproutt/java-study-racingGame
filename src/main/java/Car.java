public class Car {

    static final char HYPHEN = '-';
    private int position;

    Car() {
        position = 0;
    }

    public void move() {
        position++;
    }

    public void printProgress() {
        for (int i = 0; i < position; i++) {
            System.out.print(HYPHEN);
        }
    }
}
