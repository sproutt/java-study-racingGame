package racingGame.util;

import racingGame.model.*;
import java.util.List;

public class ResultView {
    static final String resultSign = "출력 결과";
    private static final char MOVED = '-';

    public static void readCar(List<Car> cars) {
        System.out.println(resultSign);
        for (Car element : cars) {
            printCar(element.getCarPosition());
        }
    }

    public static void printCar(int carPosition) {
        for (int i = 0; i < carPosition; i++) {
            System.out.print(MOVED);
        }
        System.out.println();
    }
}
