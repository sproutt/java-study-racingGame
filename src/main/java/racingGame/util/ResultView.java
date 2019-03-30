package racingGame.util;

import racingGame.model.Car;

import java.util.List;

public class ResultView {
    private static final String RESULT_SIGN = "출력 결과";
    private static final char MOVED = '-';

    public static void printResult(List<Car> cars) {
        System.out.println(RESULT_SIGN);
        for (Car car : cars) {
            readCar(car.getCarPosition());
        }
    }

    public static void readCar(int carPosition) {
        for (int i = 0; i < carPosition; i++) {
            System.out.print(MOVED);
        }
        System.out.println();
    }
}
