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
        Car[] cars = new Car[racingGame.getNumberOfCars(nameOfCars)];
        cars = racingGame.setCars(cars, nameOfCars);
        cars = racingGame.startGame(cars);
        RacingResult racingResult = new RacingResult(cars);
        ResultView.printResult(racingResult);
        ResultView.printWinner(racingResult.getWinners());
    }
}
