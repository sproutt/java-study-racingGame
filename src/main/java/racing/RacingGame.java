package racing;

import java.util.ArrayList;

public class RacingGame {
    Utils utils = new Utils();
    private static final int CRITICAL_POINT = 4;
    private int time;
    private ArrayList<Integer> carPositions = new ArrayList<>();

    public int checkMove(boolean check, int index) {
        int count = carPositions.get(index);
        if (check) {
            return ++count;
        }
        return count;
    }

    public void setCarPositions(int numberOfCar) {
        for (int i = 0; i < numberOfCar; i++) {
            carPositions.add(0);
        }
    }

    public ArrayList<Integer> getCarPositions() {
        return carPositions;
    }

    public void setTimes(int numberOfTimes) {
        time = numberOfTimes;
    }

    public boolean isMoving() {
        if (utils.generateNumber() >= CRITICAL_POINT) {
            return true;
        }
        return false;
    }

    public ArrayList<Integer> move() {
        for (int index = 0; index < carPositions.size(); index++) {
            carPositions.set(index, checkMove(isMoving(), index));
        }
        return carPositions;
    }

    public ArrayList<Integer> tryOut() {
        for (int numberOfTimes = 0; numberOfTimes < time; numberOfTimes++) {
            carPositions = move();
        }
        return carPositions;
    }
}
