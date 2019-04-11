package controller;

import model.*;
import view.InputView;
import view.ResultView;

public class RacingGameMain {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.readyGame(InputView.InputName(), InputView.InputNumberOfAttempts());
        RacingGameResult racingGameResult = new RacingGameResult(racingGame.playGame());
        ResultView.showRacingCarResult(racingGameResult);
        ResultView.showWinner(racingGameResult);
    }
}