public class RacingGameStep1 {
    public static void main(String args[]) {
        Car[] cars;
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        int numberOfCar = inputView.inputNumberOfCar();
        int numberOfRound = inputView.inputNumberOfRound();
        GameController gameController = new GameController();
        cars = gameController.setCars(numberOfCar);
        gameController.doGame(numberOfCar, numberOfRound);
        outputView.printResults(cars);
    }
}
