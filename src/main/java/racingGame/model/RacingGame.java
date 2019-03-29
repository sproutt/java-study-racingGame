package racingGame.model;

import racingGame.util.ResultView;
import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars;

    public List<Car> settingCar(int numCar) {
        cars = new ArrayList<>();
        for (int i = 0; i < numCar; i++) {
            Car car = new Car();
            cars.add(car);
        }
        return cars;
    }

    public void tryGame(int numberOfTry) {
        for (Car element: cars ) {
            element.tryGame(numberOfTry);
        }
        ResultView.readCar(cars);
    }
}