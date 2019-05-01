package racinggame.javajigi_racingGame.view;

import racinggame.javajigi_racingGame.dto.CarDto;
import racinggame.javajigi_racingGame.dto.RacingResult;

public class ResultView {
    public static void printResult(RacingResult result) {
        System.out.println("실행 결과");
        for ( CarDto carDto: result.getCars() ) {
            System.out.println(String.format("%s: %s", carDto.getName(), carDto.createStatus()));
        }
        System.out.println(String.format("%s가 최종 우승했습니다", result.createWinnerNames()));
    }
}