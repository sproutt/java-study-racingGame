package racingGame.controller;

import racingGame.Service.CarService;
import racingGame.Service.RacingGameResultService;
import racingGame.model.Car;
import racingGame.view.InputView;
import racingGame.view.OutputView;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


public class RacingGameController {

    public void start(String[] carsNames, int tryNumber) {
        drawResults(tryForTryNumber(CarService.makeCars(carsNames), tryNumber));
    }

    public void drawResults(Car[] cars) {
        OutputView.drawResultMessage();
        OutputView.drawCars(cars);
        OutputView.drawWinner(RacingGameResultService.getWinners(cars));
    }

    public Car[] tryForTryNumber(Car[] cars, int trys) {
        for (int k = 0; k < trys; k++) {
            CarService.moveCars(cars);
        }
        return cars;
    }

}
