package racingGame.model;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars;

    public void settingCar(int numCar) {
        cars = new ArrayList<>();
        for (int i = 0; i < numCar; i++) {
            Car car = new Car();
            cars.add(car);
        }
    }

    public void tryGame(int numberOfTry) {
        for (Car car : cars) {
            car.tryGame(numberOfTry);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}