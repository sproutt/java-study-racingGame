package racing;

import racing.utils.Generator;
import racing.utils.Splitter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class RacingGame {
    private static final int MIN_NUMBER_FOR_MOVE = 4;
    private List<Car> cars = new ArrayList<>();
    private int winnerPosition = 0;

    public void moveSelectedCar(Car car) {
        if (isMoving()) {
            car.move();
        }
    }

    public void setCar(String nameOfCar) {
        stream(Splitter.splitCarNames(nameOfCar)).forEach(name -> cars.add(new Car(name)));
    }

    public boolean isMoving() {
        if (Generator.generateNumber() >= MIN_NUMBER_FOR_MOVE) {
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

    public List<Car> getWinner() {
        int winnerPosition = calculateMaxPosition();
        return cars.stream()
                .filter(car -> car.isSame(winnerPosition))
                .collect(Collectors.toList());
    }

    public int calculateMaxPosition() {
        cars.stream().forEach(car -> winnerPosition = car.checkWinner(winnerPosition));
        return winnerPosition;
    }
}
