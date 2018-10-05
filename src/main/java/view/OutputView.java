package view;

import dto.RacingGameResult;

public class OutputView {

    public static void printRacingGameResult(RacingGameResult result) {
        System.out.println("실행 결과");

        result.visualize();
    }

    public static void printWinners(RacingGameResult result) {
        System.out.println(result.getWinnersName() + "가 최종 우승했습니다.");
    }
}
