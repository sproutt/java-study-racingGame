package racingGame.model;

import racingGame.util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars;
    private static int MOVE_RESTRICTION = 4;

    public void settingCar(int numCar) {
        cars = new ArrayList<>();
        for (int i = 0; i < numCar; i++) {
            Car car = new Car();
            cars.add(car);
        }
    }

    public List<Car> tryAllCarGame(int numberOfTry) {
        for (Car car : cars) {
            tryEachCarGame(car, numberOfTry);
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
            car.carMove();
        }
    }

    private boolean isMove() {
        if (RandomGenerator.randomGenerator() >= MOVE_RESTRICTION) {
            return true;
        }
        return false;
    }
}