import controller.RacingGame;
import domain.RacingGameResult;
import view.InputView;
import view.OutputView;

public class RacingMain {

    private static RacingGame racingGame = new RacingGame();

    public static void main(String[] args) {
        racingGame.setCars(InputView.readNumberOfCars());
        RacingGameResult result = racingGame.play(InputView.readTryRound());

        OutputView.printRacingGameResult(result);
    }
}
