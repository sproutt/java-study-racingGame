package racingGame.client;

import racingGame.controller.RacingGame;
import racingGame.model.Car;
import racingGame.view.InputView;
import racingGame.view.OutputView;

public class RacingGameClient {

    public static void main(String[] args) {

        RacingGame racingGame = new RacingGame();
        Car[] cars = racingGame.makeCars(InputView.getCarsNames());
        racingGame.tryForTryNumber(cars, InputView.getTryNumber());
        OutputView.drawResults(cars, racingGame.getWinners(cars));
    }

}
