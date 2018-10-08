import model.RacingGame;
import view.RacingGameInputView;
import view.RacingGameOutputView;

public class RacingGameApplication {
    private static RacingGame racingGame = new RacingGame();

    public static void main(String[] args) {


        racingGame.setCars(RacingGameInputView.inputNumberOfCars());
        racingGame.start(RacingGameInputView.inputTrials());
        RacingGameOutputView.printCars(racingGame.getCars());
        RacingGameOutputView.printWinner(racingGame.getWinner());
    }
}
