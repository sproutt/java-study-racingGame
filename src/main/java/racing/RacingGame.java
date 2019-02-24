package racing;

import racing.utils.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private static final int MIN_NUMBER_FOR_MOVE = 4;
    public List<Car> cars = new ArrayList<>();

    public void moveSelectedCar(Car car) {
        if (isMoving()) {
           car.move();
        }
    }

    public void setCar(int numberOfCar) {
        for (int i = 0; i < numberOfCar; i++) {
            cars.add(new Car());
        }
    }

    public boolean isMoving() {
        if (RandomGenerator.generateNumber() >= MIN_NUMBER_FOR_MOVE) {
            return true;
        }
        return false;
    }

    public void moveCars() {
        for (Car car : cars) {
            moveSelectedCar(car);
        }
    }

    public List<Car> tryOut(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            moveCars();
        }
        return cars;
    }
}
