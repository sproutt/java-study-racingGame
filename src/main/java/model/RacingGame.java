package model;

import util.*;
import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final static int CONDITION_TO_MOVE = 4;
    private final static int RANDOM_NUMBER_RANGE = 10;
    private int numberOfAttempts;
    private List<Car> cars;
    private List<Integer> record;

    public RacingGame() {
        cars = new ArrayList<>();
        record = new ArrayList<>();
    }

    public List<Integer> playGame() {
        for (int i = 0; i < numberOfAttempts; i++) {
            moveCars();
        }
        gameOver();
        return record;
    }

    private void gameOver() {
        for (Car car : cars) {
            car.submitRecord(record);
        }
    }

    public void readyGame(int numberOfCars, int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
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