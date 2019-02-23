package racing;

import racing.view.InputView;
import racing.view.ResultView;

public class Main {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.setCarPositions(InputView.receiveNumberOfCar());
        racingGame.setTimes(InputView.receiveNumberOfTimes());
        ResultView.printResult(racingGame.start());
    }
}
