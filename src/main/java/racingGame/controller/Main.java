package racingGame.controller;

import racingGame.model.Car;
import racingGame.model.RacingGame;
import racingGame.model.Winner;
import racingGame.util.InputView;
import racingGame.util.ResultView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        Winner winner = new Winner();

        racingGame.settingCar(InputView.inputCar());
        List<Car> finishedCars = racingGame.tryAllCarGame(InputView.inputTry());
        ResultView.printResult(finishedCars);
        ResultView.printWinner(winner.makeWinners(finishedCars));
    }
}