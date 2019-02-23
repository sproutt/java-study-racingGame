package racing;

public class Main {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        int numberOfCar = InputView.receiveNumberOfCar();
        racingGame.setCarPositions(numberOfCar);
        racingGame.setTimes(InputView.receiveNumberOfTimes());
        int[] currentCarPositions = racingGame.move(numberOfCar);
        ResultView.printResult(currentCarPositions);
    }
}
