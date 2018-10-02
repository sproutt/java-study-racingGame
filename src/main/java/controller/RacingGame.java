package controller;

import domain.Car;
import domain.RacingGameResult;
import utils.RandomValueGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private static final int FORWARD_CONDITION = 4;
    private static final int BOUNDARY = 10;

    private List<Car> cars;

    public void setCars(int numberOfCars) {
        cars = new ArrayList<>(numberOfCars);

        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
        }
    }

    public RacingGameResult play(int tryRound) {
        for (int i = 0; i < tryRound; i++) {
            moveCars();
        }
        return new RacingGameResult(cars);
    }

    private void moveCars() {
        for (Car car : cars) {
            moveSelectedCar(car);
        }
    }

    private void moveSelectedCar(Car car) {
        if (isMoveCondition()) {
            car.move();
        }
    }

    private boolean isMoveCondition() {
        return RandomValueGenerator.generate(BOUNDARY) > FORWARD_CONDITION;
    }
}
