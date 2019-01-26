package racingGame.view;

import racingGame.model.Car;

public class OutputView {
    private final char trace = '-';

    private void drawCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            drawTrace(cars[i].getPosition());
        }
    }

    private void drawTrace(int traceCount) {
        for (int i = 0; i < traceCount; i++) {
            System.out.print(trace);
        }
        System.out.println("차");
    }


}
