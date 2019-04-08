package racingGame.model;

import racingGame.util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    public List<Car> cars;
    private static int MOVE_RESTRICTION = 4;

    public void settingCar(String[] names) {
        cars = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Car car = new Car();
            cars.add(car);
            cars.get(i).setPlayerName(names,i);
        }
    }

    public List<Car> tryAllCarGame(int numberOfTry) {
        for (Car car : cars) {
            tryEachCarGame(car, numberOfTry);
            car.calculateWinnerPosition();
        }
        return cars;
    }

    private void tryEachCarGame(Car car, int numberOfTry) {
        for (int i = 0; i < numberOfTry; i++) {
            move(car);
        }
    }

    private void move(Car car) {
        if (isMove()) {
            car.move();
        }
    }

    private boolean isMove() {
        if (RandomGenerator.randomGenerator() >= MOVE_RESTRICTION) {
            return true;
        }
        return false;
    }
}