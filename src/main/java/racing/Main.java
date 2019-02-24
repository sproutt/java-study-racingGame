package racing;

import racing.view.InputView;
import racing.view.ResultView;

public class Main {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.setCar(InputView.receiveNumberOfCar());
        ResultView.printResult(racingGame.tryOut(InputView.receiveNumberOfTimes()));
    }
}
