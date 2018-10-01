package view;

import model.Car;
import controller.RacingGame;

public class RacingGameMain {

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();

        Car[] car = racingGame.makeCar(InputView.inputCars());
        racingGame.startRace(InputView.inputCounts());
        OutputView.operatingOutput(car);
    }
}