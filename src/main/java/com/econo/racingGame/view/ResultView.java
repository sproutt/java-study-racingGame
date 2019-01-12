package com.econo.racingGame.view;

import com.econo.racingGame.model.GameDB;

public class ResultView {

    private static final char BAR = '-';

    public static void printResult(GameDB gameDB) {
        for (int i = 0; i < gameDB.getCarPositions().length; i++) {
            printIndividual(gameDB.getCarPositions()[i]);
        }
    }

    private static void printIndividual(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print(BAR);
        }
        System.out.println();
    }

}