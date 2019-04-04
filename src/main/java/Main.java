public class Main {
    public static void main(String[] args) {
        InputView input = new InputView();
        RacingCar racingCar = new RacingCar(input.getInputNumberOfCars(), input.getInputTime());
        racingCar.playGame();
        new ResultView().viewRacingCarResult(racingCar);
    }
}