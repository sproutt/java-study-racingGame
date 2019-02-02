package racingGame.view;

import racingGame.controller.RacingGame;
import racingGame.model.Car;

public class OutputView {
    private static final char TRACE = '-';

    public static void drawResults(Car[] cars, String winners) {
        System.out.println("\n실행결과\n");
        drawCars(cars);
        drawWinner(winners);
    }

    public static void drawCars(Car[] cars) {

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i].getName() + " : ");
            drawTrace(cars[i].getPosition());
        }
        System.out.println("");
    }

    public static void drawTrace(int traceCount) {
        for (int i = 0; i < traceCount; i++) {
            System.out.print(TRACE);
        }
        System.out.println("");
    }

    public static void drawWinner(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }

}
