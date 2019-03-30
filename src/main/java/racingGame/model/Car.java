package racingGame.model;

import racingGame.util.RandomGenerator;

public class Car {
    private static int MOVE_RESTRICTION = 4;
    private int carPosition = 0;

    public int getCarPosition() {
        return carPosition;
    }

    public int tryGame(int numberOfTry) {
        for (int i = 0; i < numberOfTry; i++) {
            move();
        }
        return carPosition;
    }

    private int move() {
        if (isMove() == true) {
            carPosition++;
        }
        return carPosition;
    }

    private boolean isMove() {
        if (RandomGenerator.randomGenerator() >= MOVE_RESTRICTION) {
            return true;
        }
        return false;
    }
}