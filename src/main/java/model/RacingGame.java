package model;

import util.*;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final static int CONDITION_TO_MOVE = 4;
    private final static int RANDOM_NUMBER_RANGE = 10;
    private int numberOfAttempts;
    private List<Car> cars;

    public RacingGame() {
        cars = new ArrayList<>();
    }

    public RacingGameResult playGame() {
        for (int i = 0; i < numberOfAttempts; i++) {
            moveCars();
        }
        return new RacingGameResult(cars);
    }

    public void readyGame(String carNames, int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
        String[] splitedName = SplitGenerator.getSplitString(carNames, ",");
        for (int i = 0; i < splitedName.length; i++) {
            cars.add(new Car(splitedName[i]));
        }
    }

    private void moveCars() {
        for (Car car : cars) {
            moveOrStopCar(car);
        }
    }

    private boolean canMove(int number) {
        if (number >= CONDITION_TO_MOVE) {
            return true;
        }
        return false;
    }

    private void moveOrStopCar(Car car) {
        if (canMove(RandomGenerator.getRandomNumber(RANDOM_NUMBER_RANGE))) {
            car.move();
        }
    }
}