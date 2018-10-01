package view;

import controller.RacingGame;
import model.Car;

public class OutputView {
    private static RacingGame racingGame = new RacingGame();

    public static void operatingOutput(Car[] car) {
        System.out.println();
        System.out.println("실행결과");
        for (int i = 0; i < car.length; i++) {
            racingGame.printMove(car[i]);
            System.out.println();
        }
    }
}