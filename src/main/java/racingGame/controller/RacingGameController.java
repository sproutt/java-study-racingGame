package racingGame.controller;

import racingGame.Service.CarService;
import racingGame.Service.GameResultService;
import racingGame.model.CarDto;
import racingGame.util.RacingGameUtil;
import racingGame.view.InputView;
import racingGame.view.OutputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class RacingGameController {

    private CarDto[] carDtos;
    private String winners;

    public void set(String[] carNames){
        carDtos = CarService.makeCars(carNames);
    }

    public void start(int tryNumber) {
        for (int k = 0; k < tryNumber; k++) {
            moveCars(carDtos);
        }
    }

    public static void moveCars(CarDto[] carDtos) {

        Arrays.asList(carDtos).stream()
                .forEach(car -> CarService.move(car, RacingGameUtil.getRandomNumber()));
    }

    public void drawResults() {
        OutputView.drawResultMessage();
        OutputView.drawCars(carDtos);
        OutputView.drawWinner(GameResultService.getWinners(carDtos));
    }
}
