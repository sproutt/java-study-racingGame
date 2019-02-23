package racing;

import java.util.Random;

public class RacingGame {
    private static final int datumPoint = 4;
    private int time;
    private int[] carPositions;

    public int checkMove(boolean check,int index) {
        int count = carPositions[index];
        if (check) {
            return ++count;
        }
        return count;
    }

    public void setCarPositions(int numberOfCar) {
        carPositions = new int[numberOfCar];
    }

    public void setTimes(int numberOfTimes) {
        time = numberOfTimes;
    }

    public boolean isMoving(int randomNumber) {
        if (randomNumber >= datumPoint) {
            return true;
        }
        return false;
    }

    public int gnerateNumber(){
        Random random = new Random();
        return random.nextInt(10);
    }

    public boolean[] assembleState() {
        boolean[] statesOfCar = new boolean[carPositions.length];
        for (int i = 0; i < carPositions.length; i++) {
            statesOfCar[i] = isMoving(gnerateNumber());
        }
        return statesOfCar;
    }

    public int[] move(boolean[] checks) {
        for (int index = 0; index < carPositions.length; index++) {
            carPositions[index] = checkMove(checks[index],index);
        }
        return carPositions;
    }

    public int[] start() {
        for (int times = 0; times < time; times++) {
            carPositions = move(assembleState());
        }
        return carPositions;
    }
}
