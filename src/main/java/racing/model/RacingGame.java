package racing.model;

import racing.utils.RandomGenerator;
import racing.utils.Splitter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class RacingGame {
    private static final int MIN_NUMBER_FOR_MOVE = 4;
    private List<Car> cars = new ArrayList<>();
    private int winnerPosition;

    public void RacingGame() {
        winnerPosition = 0;
    }

    public void setCar(String nameOfCar) {
        stream(Splitter.splitCarNames(nameOfCar)).forEach(name -> cars.add(new Car(name)));
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getWinnerPosition() {
        return winnerPosition;
    }

    public List<Car> run(int numberOfTimes) {
        for (int times = 0; times < numberOfTimes; times++) {
            moveCars();
        }
        return cars;
    }

    private void moveCars() {
        for (Car car : cars) {
            moveSelectedCar(car);
        }
    }

    public void moveSelectedCar(Car car) {
        if (isMoving()) {
            car.move();
        }
    }

    public boolean isMoving() {
        if (RandomGenerator.generateNumber() >= MIN_NUMBER_FOR_MOVE) {
            return true;
        }
        return false;
    }

    public List<Car> getWinner() {
        return cars.stream()
                .filter(car -> car.isSamePosition(winnerPosition))
                .collect(Collectors.toList());
    }

    public void calculateMaxPosition() {
        cars.stream().forEach(car -> winnerPosition = car.checkMax(winnerPosition));
    }
}
