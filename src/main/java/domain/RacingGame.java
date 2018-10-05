package domain;

import dto.RacingGameResult;
import utils.RandomValueGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    private static final int FORWARD_CONDITION = 4;
    private static final int BOUNDARY = 10;

    private List<Car> cars;

    public void setCars(String carNames) {
        String[] carArrays = carNames.split(",");
        cars = new ArrayList<>();

        for (int i = 0; i < carArrays.length; i++) {
            cars.add(new Car(carArrays[i]));
        }
    }

    public RacingGameResult play(int tryRound) {
        for (int i = 0; i < tryRound; i++) {
            moveCars();
        }
        return new RacingGameResult(cars.stream().map(Car::toCarDTO).collect(Collectors.toList()));
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
