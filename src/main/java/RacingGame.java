import java.util.Random;

public class RacingGame {
    static final int BOUNDARY_VALUE = 4;
    private Car[] car;

    public Car[] makeCar(int num) {
        car = new Car[num];
        for (int i = 0; i < num; i++) {
            car[i] = new Car();
        }
        return car;
    }

    public int judgeMovement() {
        Random random = new Random();
        int go = random.nextInt(10);
        if (go < BOUNDARY_VALUE) return 0;
        return 1;
    }

    public int move(int count) {
        int position = 0;
        for (int i = 0; i < count; i++) {
            int go = judgeMovement();
            position += go;
        }
        return position;
    }

    public void printMove(Car car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
    }
}


