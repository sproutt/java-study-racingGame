package view;

import domain.RacingGameResult;

public class OutputView {

    public static void printRacingGameResult(RacingGameResult result) {
        System.out.println("실행 결과");

        result.visualize();
    }
}
