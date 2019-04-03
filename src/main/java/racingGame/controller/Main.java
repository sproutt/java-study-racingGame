package racingGame.controller;

import racingGame.model.RacingGame;
import racingGame.util.InputView;
import racingGame.util.ResultView;

public class Main {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.settingCar(InputView.inputCar());
        ResultView.printResult(racingGame.tryAllCarGame(InputView.inputTry()));
        ResultView.printWinner(racingGame.makeWinners());
    }
}