package racing.view;

import racing.Car;

import java.util.List;

public class ResultView {
    private static final String BLOCK = "-";

    public static void printResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + ":" + showDistance(car));
            ;
        }
    }

    public static String showDistance(Car car) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < car.getPosition(); i++) {
            stringBuilder.append(BLOCK);
        }
        return stringBuilder.toString();
    }

    public static void printWinner(List<Car> cars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars) {
            stringBuilder.append(car.getName() + " ");
        }
        System.out.println(stringBuilder.toString() + "가 우승했습니다.");
    }
}
