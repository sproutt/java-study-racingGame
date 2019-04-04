import java.util.Random;

public class RacingCar {

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
        Random random = new Random();
        return random.nextInt(range);
    }

    public boolean canMove(int number) {
        if (number >= 4) {
            return true;
        }
        return false;
    }

    public void moveOrStop(int index) {
        if (canMove(randomNumber(10))) {
            moveCar(index);
        }
    }

    public void printStatus() {
        for (int i = 0; i < numberOfCars; i++) {
            System.out.println(i + 1 + "번째 차의 위치는 " + carPosition[i] + "입니다");
        }
    }
}