package racingGame.controller;

import racingGame.model.Car;
import racingGame.view.InputView;
import racingGame.view.OutputView;

import java.util.Random;

public class RacingGameController {
    private final int MOVE_BOUNDARY = 4;
    private int trys;

    public static void main(String[] args) {
        RacingGameController racingGame = new RacingGameController();
        racingGame.playGame(racingGame);
    }

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
        return random.nextInt(10);
    }

    public boolean isMove() {
        boolean isMove = false;
        if (getRandomNumber() >= 4) {
            isMove = true;
        }
        return isMove;
    }

    public void checkMove(Car car) {
        if (isMove()) {
            car.move();
        }
    }

    public void playGame(RacingGameController racingGame) {
        Car[] cars = racingGame.makeCars(InputView.getCarsNumber());
        racingGame.moveCars(cars, InputView.getTryNumber());
        OutputView.drawCars(cars);
    }
}
