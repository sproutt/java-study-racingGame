package controller;

import model.*;
import view.InputView;
import view.ResultView;

public class RacingGameMain {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.readyGame(InputView.InputName(), InputView.InputNumberOfAttempts());
        ResultView.showRacingCarResult(racingGame.playGame());
        ResultView.showWinner(racingGame);
    }
}