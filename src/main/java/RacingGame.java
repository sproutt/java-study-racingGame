
public class RacingGame {

    public static void main(String[] args) {
        Car car = new Car();
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        RacingController racingController = new RacingController(car, inputView, resultView);

        racingController.input();
        racingController.racing();
        racingController.printResult();
    }
}
