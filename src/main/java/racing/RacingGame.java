package racing;

import java.util.Random;

public class RacingGame {
    private int time = 1;
    private int[] carPositions;

    public int countMove(boolean[] checks) {
        int count = 0;
        for (int index = 0; index < time; index++) {
            count = moveCheck(checks[index], count);
        }
        return count;
    }

    public int moveCheck(boolean check, int count) {
        if (check) {
            return ++count;
        }
        return count;
    }

    public int[] setCarPositions(int numberOfCar) {
        carPositions = new int[numberOfCar];
        return carPositions;
    }

    public void setTimes(int numberOfTimes) {
        time = numberOfTimes;
    }

    public boolean isMoing() {
        Random random = new Random();
        if (random.nextInt(10) >= 4) {
            return true;
        }
        return false;
    }

    public boolean[] isSelected() {
        boolean[] selectedMoving = new boolean[time];
        for (int i = 0; i < time; i++) {
            selectedMoving[i] = isMoing();

        }
        return selectedMoving;
    }

    public int[] move() {
        for (int index = 0; index < carPositions.length; index++) {
            carPositions[index] = countMove(isSelected());
        }
        return carPositions;
    }
}
