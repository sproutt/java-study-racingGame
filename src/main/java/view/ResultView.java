package view;

import model.RacingGameResult;

import java.util.List;

public class ResultView {

    private static final char HYPHEN = '-';
    private static final String BLANK = " : ";

    public static void showRacingCarResult(RacingGameResult racingGameResult) {
        List<String> results = racingGameResult.showRecords(HYPHEN, BLANK);
        for (String result : results) {
            System.out.println(result);
        }
    }

    public static void showWinner(RacingGameResult racingGameResult) {
        System.out.println("우승자는 " + racingGameResult.getWinners() + "입니다.");
    }
}