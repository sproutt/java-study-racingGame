package racing.view;

import racing.Car;
import java.util.List;

public class ResultView {
    public static void printResult(List<Car> cars) {
        for (Car car : cars) {
            car.showDistance();
        }
    }
}
