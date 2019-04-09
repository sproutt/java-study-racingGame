package controller;

import model.*;
import view.InputView;
import view.ResultView;

public class RacingGameMain {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.readyGame(InputView.InputNumberOfCars(), InputView.InputTime());
        ResultView.showRacingCarResult(racingGame.playGame());
    }
}