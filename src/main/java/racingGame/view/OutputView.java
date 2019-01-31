package racingGame.view;

import racingGame.controller.RacingGameController;
import racingGame.model.Car;

public class OutputView {
    private static final char TRACE = '-';

    public static void drawResults(Car[] cars) {
        System.out.println("");
        System.out.println("실행결과");
        System.out.println("");
        drawCars(cars);
        drawWinner(cars);
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

    public static void drawWinner(Car[] cars) {
        RacingGameController racingGameController = new RacingGameController();
        System.out.println(racingGameController.getWinners(cars)+"가 최종 우승했습니다.");
    }

}
