package racingGame.controller;

import racingGame.model.RacingGame;
import racingGame.util.InputView;

public class Main {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.settingCar(InputView.inputCar());
        racingGame.tryGame(InputView.inputTry());
    }
}