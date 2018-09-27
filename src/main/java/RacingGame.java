import utils.RandomValueGenerator;

public class RacingGame {
    static final private int BOUNDARY_VALUE = 4;
    private Car[] car;
    private RandomValueGenerator random;

    public Car[] makeCar(int num) {
        car = new Car[num];
        for (int i = 0; i < num; i++) {
            car[i] = new Car();
        }
        return car;
    }

    public int judgeMovement() {
        random = new RandomValueGenerator();
        int go = random.getRandomNumber();
        if (go < BOUNDARY_VALUE) return 0;
        return 1;
    }

    public int moveCar(int count) {
        int position = 0;
        for (int i = 0; i < count; i++) {
            int go = judgeMovement();
            position += go;
        }
        return position;
    }

    public void startRace(int count) {
        for (int i = 0; i < car.length; i++) {
            int position = moveCar(count);
            car[i].setPosition(position);
        }
    }

    public void printMove(Car car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
    }
}


