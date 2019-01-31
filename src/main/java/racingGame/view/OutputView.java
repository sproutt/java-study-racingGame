package racingGame.view;

import racingGame.model.Car;

public class OutputView {
    private static final char TRACE = '-';

    public static void drawCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i].getName()+" : ");
            drawTrace(cars[i].getPosition());
        }
    }

    public static void drawTrace(int traceCount) {
        for (int i = 0; i < traceCount; i++) {
            System.out.print(TRACE);
        }
    }

}
