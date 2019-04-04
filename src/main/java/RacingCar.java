import java.util.Random;

public class RacingCar {

    final static int CONDITION_TO_MOVE = 4;
    final static int RANDOM_NUMBER_RANGE = 10;
    private int time;
    private int[] carPosition;
    private int numberOfCars;

    RacingCar(int numberOfCars, int time) {
        this.numberOfCars = numberOfCars;
        this.time = time;
        carPosition = new int[numberOfCars];
    }

    public void playGame() {
        for (int i = 0; i < time; i++) {
            moveCars();
            printStatus();
        }
    }

    public void moveCars() {
        for (int i = 0; i < numberOfCars; i++) {
            moveOrStop(i);
        }
    }

    public void moveCar(int index) {
        carPosition[index]++;
    }

    public int randomNumber(int range) {
        return new Random().nextInt(range);
    }

    public int getCarPosition(int i) {
        return carPosition[i];
    }

    public boolean canMove(int number) {
        if (number >= CONDITION_TO_MOVE) {
            return true;
        }
        return false;
    }

    public void moveOrStop(int index) {
        if (canMove(randomNumber(RANDOM_NUMBER_RANGE))) {
            moveCar(index);
        }
    }

    public void printStatus() {
        System.out.println("-------------------------");
        for (int i = 0; i < numberOfCars; i++) {
            System.out.println(i + 1 + "번째 차의 위치는 " + carPosition[i] + "입니다");
        }
        System.out.println("-------------------------");
    }
}