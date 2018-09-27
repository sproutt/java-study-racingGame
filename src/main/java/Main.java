public class Main {

    public static void main(String[] args) {
        Car[] car;
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RacingGame racingGame = new RacingGame();
        int num = inputView.inputCars();
        car = racingGame.makeCar(num);
        int count = inputView.inputCounts();
        racingGame.startRace(count);
        outputView.operatingOutput(car);
    }
}