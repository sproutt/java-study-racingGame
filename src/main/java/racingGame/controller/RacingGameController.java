package racingGame.controller;

import racingGame.Service.CarService;
import racingGame.Service.GameResultService;


public class RacingGameController {

    private CarService carService;
    private GameResultService gameResultService;

    public RacingGameController(){
        carService = new CarService();
        gameResultService = new GameResultService();
    }

    public void set(String[] carNames){
        carService.makeCars(carNames);
    }

    public String[] play(int tryNumber) {
        for (int k = 0; k < tryNumber; k++) {
            carService.moveCars();
        }
        return GameResultService.getResults();
    }
}
