package app;

import domain.Car;
import domain.RacingGame;
import dto.RacingResult;
import view.InputView;
import view.ResultView;

public class RacingMain {

    public static void main(String[] args) {
        String nameOfCars = InputView.inputNameOfCars();
        RacingGame racingGame = new RacingGame(InputView.inputTime());
        RacingResult racingResult = new RacingResult();
        Car[] cars = new Car[racingGame.getNumberOfCars(nameOfCars)];

        cars = racingGame.setCars(cars, nameOfCars);
        cars = racingGame.startGame(cars);
        racingResult.updateResult(cars);

        ResultView.printResult(racingResult);
        ResultView.printWinner(racingResult.getWinners());
    }
}
