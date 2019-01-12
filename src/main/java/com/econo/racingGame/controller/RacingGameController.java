package com.econo.racingGame.controller;

import com.econo.racingGame.model.GameDB;
import com.econo.racingGame.view.InputVIew;

import java.util.Random;

public class RacingGameController {

    public final static int MOVEBOUNDARY = 4;
    public static GameDB gameDB;

    public static void makeGameDB() {
        gameDB = new GameDB();
        gameDB.makeCarPositions(InputVIew.carNumber());
        gameDB.setTryNumber(InputVIew.tryNumber());
    }

    public GameDB makeResult(GameDB gameDB) {
        for (int i = 0; i < gameDB.getCarPositions().length; i++) {
            gameDB.getCarPositions()[i] = makeIndividualResult(gameDB);
        }
        return gameDB;
    }

    public int makeIndividualResult(GameDB gameDB) {
        int individualResult = 0;
        for (int i = 0; i < gameDB.getTryNumber(); i++) {
            individualResult = individualResult + goStop();
        }
        return individualResult;
    }

    private int goStop() {
        Random random = new Random();
        int nowResult = random.nextInt(10);
        if (nowResult >= MOVEBOUNDARY) {
            return 1;
        }
        return 0;
    }

}

