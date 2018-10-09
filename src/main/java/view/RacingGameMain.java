package view;

import model.Car;
import model.RacingGame;
import model.RacingResult;


public class RacingGameMain {

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        Car[] car = racingGame.makeCar(InputView.inputCars());
        RacingResult result = new RacingResult(car);
        racingGame.startRace(car, InputView.inputCounts());
        OutputView.printOutput(result);
        racingGame.foundWinnerPosition(car, racingGame.getWinnersPosition(car));
        racingGame.printWinner();
    }
}
