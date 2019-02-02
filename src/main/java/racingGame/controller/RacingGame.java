package racingGame.controller;

import racingGame.model.Car;
import racingGame.view.InputView;
import racingGame.view.OutputView;

import java.util.Random;

public class RacingGame {
    private static final int MOVE_BOUNDARY = 4;
    private static final int RANDOM_MAX = 10;

    public Car[] makeCars(String[] carNames) {
        Car[] cars = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }
        return cars;
    }

    public void tryForTryNumber(Car[] cars, int trys) {
        for (int k = 0; k < trys; k++) {
            moveCars(cars);
        }
    }

    public void moveCars(Car[] cars) {

        for (int i = 0; i < cars.length; i++) {
            checkMove(cars[i]);
        }
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(RANDOM_MAX);
    }

    public boolean isMove(int randomNumber) {
        if (randomNumber >= MOVE_BOUNDARY) {
            return true;
        }
        return false;
    }

    public void checkMove(Car car) {
        if (isMove(getRandomNumber())) {
            car.move();
        }
    }

    public String findWinners(Car[] cars) {
        String winners = getWinnerNames(cars, getMaxNumber(cars));
        return winners;
    }

    public int getMaxNumber(Car[] cars) {
        int maxNumber = cars[0].getPosition();
        for (int i = 1; i < cars.length; i++) {
            maxNumber = Math.max(maxNumber, cars[i].getPosition());
        }
        return maxNumber;
    }

    public String getWinnerNames(Car[] cars, int maxNumber) {
        String carNames = "";
        for (int i = 0; i < cars.length; i++) {
            carNames += getWinnerName(cars[i], maxNumber);
        }
        carNames = toWinnerPrintFormat(carNames);
        return carNames;
    }

    public String getWinnerName(Car car, int maxNumber) {
        if (car.getPosition() == maxNumber) {
            return car.getName() + ", ";
        }
        return "";
    }

    public String toWinnerPrintFormat(String rawWinnerName) {
        return rawWinnerName.substring(0, rawWinnerName.length() - 2);
    }
}
