public class RacingGameApplication {
    private static RacingGameController racingGame = new RacingGameController();

    public static void main(String[] args) {


        int numberOfCars = RacingGameInputView.inputNumberOfCars();
        int trials = RacingGameInputView.inputTrials();

        racingGame.setCars(numberOfCars, trials);
        RacingGameOutputView.printCars(racingGame.getCars());
    }
}
