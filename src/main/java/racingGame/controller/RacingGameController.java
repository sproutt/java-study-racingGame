package racingGame.controller;

import racingGame.Service.CarService;
import racingGame.Service.GameResultService;


public class RacingGameController {

    private CarService carService;

    public RacingGameController() {
        carService = new CarService();
    }

    public void set(String[] carNames) {
        carService.makeCars(carNames);
    }

    public String[] play(int tryNumber) {
        for (int k = 0; k < tryNumber; k++) {
            carService.moveCars();
        }

        return new GameResultService(carService.getCars()).getResults();
    }
}
