package app;

import domain.Car;
import domain.RacingGame;
import domain.RacingResult;
import dto.RacingResultDto;
import view.InputView;
import view.ResultView;

import java.util.*;

public class RacingMain {

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame(InputView.inputTime());
        RacingResult racingResult = new RacingResult();
        RacingResultDto racingResultDto = new RacingResultDto(racingResult);
        List<Car> cars = new ArrayList<>();

        cars = racingGame.setCars(cars, InputView.inputNameOfCars());
        cars = racingGame.startGame(cars);

        racingResult.updateResult(cars);

        ResultView.printResult(racingResultDto);
    }
}
