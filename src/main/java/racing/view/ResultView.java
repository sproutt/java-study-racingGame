package racing.view;

import racing.Car;
import java.util.List;

public class ResultView {
    public static final String BLOCK = "-";
    public static void printResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(showDistance(car));;
        }
    }

    public static String showDistance(Car car) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < car.getPosition(); i++) {
            stringBuilder.append(BLOCK);
        }
        return stringBuilder.toString();
    }
}
