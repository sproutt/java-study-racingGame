package racingGame.controller;

import racingGame.model.Car;
import racingGame.view.InputView;
import racingGame.view.OutputView;

import java.util.Random;

public class RacingGameController {
    private static final int MOVE_BOUNDARY = 4;
    private static final int RANDOM_MAX = 10;

    public Car[] makeCars(int carsNumber) {
        return new Car[carsNumber];
    }

    public void moveCars(Car[] cars, int trys) {
        for (int i = 0; i < trys; i++) {
            checkMove(cars[i]);
        }
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(RANDOM_MAX);
    }

    public boolean isMove(int randomNumber) {
        if (randomNumber >= MOVE_BOUNDARY) {
            return true;
        }
        return false;
    }

    public void checkMove(Car car) {
        if (isMove( getRandomNumber() )) {
            car.move();
        }
    }

    public void playGame() {
        RacingGameController racingGame = new RacingGameController();
        Car[] cars = racingGame.makeCars(InputView.getCarsNumber());
        racingGame.moveCars(cars, InputView.getTryNumber());
        OutputView.drawCars(cars);
    }
}
