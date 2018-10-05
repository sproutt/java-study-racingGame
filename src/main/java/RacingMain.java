import domain.RacingGame;
import dto.RacingGameResult;
import view.InputView;
import view.OutputView;

public class RacingMain {

    private static RacingGame racingGame = new RacingGame();

    public static void main(String[] args) {
        racingGame.setCars(InputView.readCarInfo());
        RacingGameResult result = racingGame.play(InputView.readTryRound());

        OutputView.printRacingGameResult(result);
        OutputView.printWinners(result);
    }
}
