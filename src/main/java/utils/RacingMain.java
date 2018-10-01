package utils;

import view.InputView;
import view.ResultView;

public class RacingMain {

    public static void main(String[] args) {
        int time = InputView.inputTime();
        int numberOfCars = InputView.inputNumberOfCars();

        RacingGame racingGame = new RacingGame(time, numberOfCars);

        ResultView.printResult(racingGame.startGame());
    }
}
