import java.util.Random;

public class RacingCar {

    final static int CONDITION_TO_MOVE = 4;
    final static int RANDOM_NUMBER_RANGE = 10;
    private int time;
    private int numberOfCars;
    private Car[] cars;

    RacingCar(int numberOfCars, int time) {
        this.numberOfCars = numberOfCars;
        this.time = time;
        cars = new Car[numberOfCars];
    }

    public void playGame() {
        readyGame();
        for (int i = 0; i < time; i++) {
            moveCars();
        }
    }

    public void readyGame() {
        for (int i = 0; i < numberOfCars; i++) {
            cars[i] = new Car();
        }
    }

    public void moveCars() {
        for (int i = 0; i < numberOfCars; i++) {
            moveOrStopCar(i);
        }
    }

    public int getRandomNumber(int range) {
        return new Random().nextInt(range);
    }

    public boolean canMove(int number) {
        if (number >= CONDITION_TO_MOVE) {
            return true;
        }
        return false;
    }

    public void moveOrStopCar(int index) {
        if (canMove(getRandomNumber(RANDOM_NUMBER_RANGE))) {
            cars[index].move();
        }
    }

    public void printResult() {
        for (int i = 0; i < numberOfCars; i++) {
            cars[i].printProgress();
            System.out.println();
        }
    }
}