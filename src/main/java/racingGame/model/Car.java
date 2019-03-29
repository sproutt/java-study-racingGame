package racingGame.model;

import racingGame.util.RandomGenerator;

public class Car {
    private static int MOVE_RESTICTION = 4;
    private int carPosition = 0;

    public int getCarPosition() {
        return carPosition;
    }

    public int tryGame(int numberOfTry) {
        for (int i = 0; i < numberOfTry; i++) {
            checkMovement();
        }
        return carPosition;
    }

    private int checkMovement() {
        if (RandomGenerator.randomGenerator() >= MOVE_RESTICTION) {
            return carPosition++;
        }
        return carPosition;
    }
}