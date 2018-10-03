import model.RacingGame;
import view.RacingGameInputView;
import view.RacingGameOutputView;

public class RacingGameApplication {
    private static RacingGame racingGame = new RacingGame();

    public static void main(String[] args) {


        String carsNameString = RacingGameInputView.inputNumberOfCars();
        int trials = RacingGameInputView.inputTrials();

        racingGame.setCars(carsNameString, trials);
        RacingGameOutputView.printCars(racingGame.getCars());
        RacingGameOutputView.printWinner(racingGame.getWinner());
    }
}
