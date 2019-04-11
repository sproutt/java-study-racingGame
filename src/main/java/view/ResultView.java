package view;

import model.RacingGameResult;

import java.util.List;

public class ResultView {

    private static final char HYPHEN = '-';

    public static void showRacingCarResult(RacingGameResult racingGameResult) {
        List<String> list  = racingGameResult.getRecord();
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static void showWinner(RacingGameResult racingGameResult){
        System.out.println("우승자는 "+racingGameResult.showWinner()+"입니다.");;
    }


}