public class RacingGame {

    public static void main(String args[]) {
        Car car[];
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        car = new Car[inputView.inputCarNumber()];
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car();
        }
        RacingColtroller racingColtroller = new RacingColtroller(car, inputView, resultView);
        int repeatTimes = inputView.inputRepeatTimes();
        for (int i = 0; i < car.length; i++) {
            car[i].setForwardCounts(racingColtroller.totalMove(repeatTimes));
        }
        resultView.printResultLabel();
        racingColtroller.printMovement(car);
    }


}
