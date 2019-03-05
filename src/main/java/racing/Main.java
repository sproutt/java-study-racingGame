package racing;

import racing.model.RacingGame;
import racing.view.InputView;
import racing.view.ResultView;

public class Main {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.setCar(InputView.receiveNameOfCars());
        ResultView.printResult(racingGame.run(InputView.receiveNumberOfTimes()));
        racingGame.calculateMaxPosition();
        ResultView.printWinner(racingGame.getWinner());
    }
}
