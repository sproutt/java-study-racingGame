package racingGame.controller;

import racingGame.model.Car;
import racingGame.model.RacingGame;
import racingGame.model.WinnerGenerator;
import racingGame.util.InputView;
import racingGame.util.ResultView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        WinnerGenerator winnerGenerator = new WinnerGenerator();

        racingGame.settingCar(InputView.inputCar());
        List<Car> finishedCars = racingGame.tryAllCarGame(InputView.inputTry());
        ResultView.printResult(finishedCars);
        ResultView.printWinner(winnerGenerator.makeWinners(finishedCars));
    }
}