package racing.domain;

import racing.dto.RacingGameResult;
import racing.utils.RandomValueGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

    public void moveCars() {
        for (Car car : cars) {
            moveSelectedCar(car, RandomValueGenerator.generate(BOUNDARY));
        }
    }

    public void moveSelectedCar(Car car, int randomValue) {
        if (isMoveCondition(randomValue)) {
            car.move();
        }
    }

    public boolean isMoveCondition(int randomValue) {
        return randomValue > FORWARD_CONDITION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingGame that = (RacingGame) o;
        return Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

    @Override
    public String toString() {
        return cars.toString();
    }
}
