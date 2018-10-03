package utils;

import domain.Car;
import view.InputView;
import view.ResultView;

public class RacingMain {

    public static void main(String[] args) {

        int time = InputView.inputTime();

        RacingGame racingGame = new RacingGame(time);
        String name = InputView.inputNameOfCars();
        String[] names = racingGame.splitName(name);
        int numberOfCars = racingGame.getNumberOfCars(names);

        Car[] cars = new Car[numberOfCars];

        cars = racingGame.setCars(cars, names);

        ResultView.printResult(racingGame.startGame(cars));
    }
}
