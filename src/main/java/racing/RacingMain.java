package racing;

import racing.dto.RacingGameResult;
import racing.view.InputView;
import racing.view.OutputView;

public class RacingMain {

    private static RacingGame racingGame = new RacingGame();

    public static void main(String[] args) {
        racingGame.setCars(InputView.readCarInfo());
        RacingGameResult result = racingGame.play(InputView.readTryRound());

        OutputView.printRacingGameResult(result);
        OutputView.printWinners(result);
    }
}
