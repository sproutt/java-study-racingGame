package racing;

public class Main {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.setCarPositions(InputView.receiveNumberOfCar());
        racingGame.setTimes(InputView.receiveNumberOfTimes());
        int[] currentCarPositions = racingGame.move();
        ResultView.printResult(currentCarPositions);
    }
}
